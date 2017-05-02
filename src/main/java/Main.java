import java.io.*;
import java.lang.String;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.testng.Assert;
import org.xml.sax.SAXException;
import registry.ca.rt.RegistryService;
import registry.ca.rt.TSLInfo;

import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Base64;
import java.util.Date;
import java.util.List;

/**
 * Created by a.chebotareva on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, SAXException {
        Config config = new Config("config.properties");
        Logger logger = Logger.getLogger(Main.class);
        logger.warn("Проверка подсистемы реестра от "+new Date());
        File log = new File(new File(".").getAbsolutePath()+"\\..\\"+"log.txt");
        FileWriter fileWriter = new FileWriter(log,true);
        try {

            SSLTool.disableCertificateValidation();
            RegistryService registryService = new RegistryService(new URL(config.get("wsdl")));
            List<TSLInfo> list = registryService.getRegistryServiceSoap().getTSLInfos(true).getTSLInfo();
            TSLInfo tslInfo = list.get(0);
            logger.info("Получение файла от сервиса "+config.get("wsdl"));
            byte[] wsdl=tslInfo.getData();
            logger.info("Успешно.");
            logger.info("Получение файла по адресу "+config.get("file"));
            byte[] url=getBytesFromUrl(new URL(config.get("file")));
            logger.info("Успешно.");
            logger.info("Сравнение...");
            Assert.assertTrue(new String(wsdl).equals(new String(url)));
            logger.info("Успешно.");
            logger.warn("Проверка прошла успешно.");
        }catch (Exception e){
            fileWriter.append("Проверка подсистемы реестра прошла успешно\n");
            logger.error("Проверка провалена. Причина: "+ stackTraceToString(e));
        }catch (AssertionError e1){
            logger.error("Проверка провалена. Причина: "+stackTraceToString(e1));
            fileWriter.append("Проверка подсистемы реестра провалена\n");
        }finally {
            fileWriter.flush();
        }
    }

    public static void main2() throws IOException {
        URL url = new URL("https://e-trust.gosuslugi.ru/CA/DownloadTSL?schemaVersion=0");
//        System.out.println(IOUtils.readFully(url.openStream(),0,false));
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream( new File("data/download.xml"));
        fileOutputStream.getChannel().transferFrom(readableByteChannel,0,Long.MAX_VALUE);
        fileOutputStream.close();
        readableByteChannel.close();
//        url.openStream().
    }

    public static byte[] getBytesFromUrl(URL url) throws IOException {
      try{
          URLConnection urlConnection = url.openConnection();
          urlConnection.setConnectTimeout(5000);
          urlConnection.setReadTimeout(5000);
          urlConnection.connect();
          ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
          IOUtils.copy(urlConnection.getInputStream(),byteArrayOutputStream);
          return byteArrayOutputStream.toByteArray();
      }catch (IOException e){
          return null;
      }
    }
    public static String stackTraceToString(Throwable e){
        StringBuilder stringBuilder = new StringBuilder();
        for(StackTraceElement stackTraceElement:e.getStackTrace()){
            stringBuilder.append(stackTraceElement.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
