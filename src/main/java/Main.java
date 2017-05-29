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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by a.chebotareva on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException, SAXException {
        Config config = new Config("config.properties");
        Logger logger = Logger.getLogger(Main.class);
        Date date = new Date();
        logger.info("********Проверка ССВС от "+date+"********");
        File log = new File(new File(".").getAbsolutePath()+"\\..\\"+"log.txt");
        FileWriter fileWriter = new FileWriter(log,true);
        byte[] wsdl=null;
        byte[] url=null;
        try {
            SSLTool.disableCertificateValidation();
            RegistryService registryService = new RegistryService(new URL(config.get("wsdl")));
            List<TSLInfo> list = registryService.getRegistryServiceSoap().getTSLInfos(true).getTSLInfo();
            TSLInfo tslInfo = list.get(0);
            logger.info("Получение файла от сервиса "+config.get("wsdl"));
            wsdl=tslInfo.getData();
            logger.info("Успешно.");
            logger.info("Получение файла по адресу "+config.get("file"));
            url=getBytesFromUrl(new URL(config.get("file")));
            logger.info("Успешно.");
            logger.info("Сравнение...");
            Assert.assertTrue(new String(wsdl).equals(new String(url)));
            logger.info("Успешно.");
            logger.info("Проверка прошла успешно.");
            fileWriter.append("Проверка ССВС прошла успешно\r\n");
            fileWriter.flush();

            String urlStr = new String(url);
            String urlDate = urlStr.split("\n")[3];
            if(urlDate.contains("Дата")){
                urlDate=urlDate.replace("<Дата>","").replace("</Дата>","").replace("T"," ");
            }else{
                for(String row:urlStr.split("\n")){
                    if(row.contains("Дата")){
                        urlDate=row.replace("<Дата>","").replace("</Дата>","").replace("T"," ");
                        break;
                    }
                }
            }
            String wsdlStr = new String(wsdl);
            String wsdlDate = wsdlStr.split("\n")[3];
            if(wsdlDate.contains("Дата")){
                wsdlDate=wsdlDate.replace("<Дата>","").replace("</Дата>","").replace("T", " ");
            }else{
                for(String row:wsdlStr.split("\n")){
                    if(row.contains("Дата")){
                        wsdlDate=row.replace("<Дата>","").replace("</Дата>","").replace("T"," ");
                        break;
                    }
                }
            }
            SimpleDateFormat answerFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date wsdlD = answerFormat.parse(wsdlDate);
            Date urlD = answerFormat.parse(urlDate);
            //todo: всё это в трай блоке!!!
            long diff = urlD.getTime()-wsdlD.getTime();
            System.out.println(TimeUnit.MILLISECONDS.toSeconds(diff));
            if(TimeUnit.MILLISECONDS.toSeconds(diff)/60>Integer.parseInt(config.get("difference"))){
                logger.error("Разница во времени между датами более "+config.get("difference"));
            }else if(TimeUnit.MILLISECONDS.toSeconds(diff)<0){
                logger.error("Время TSL, опубликованного на сайте новее, чем время TSL веб-сервиса.");
            }else{
                SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy_HH-mm-ss");
                String stringDate = dateFormat.format(date);
                File wsdlFile = new File(new File(".").getAbsolutePath()+"\\..\\"+"wsdl_"+stringDate+".txt");
                FileWriter wsdlfilewriter = new FileWriter(wsdlFile);
                wsdlfilewriter.write(new String(wsdl));
                File urlfile = new File(new File(".").getAbsolutePath()+"\\..\\"+"url_"+stringDate+".txt");
                FileWriter urlfilewriter = new FileWriter(urlfile);
                urlfilewriter.write(new String(url));
                wsdlfilewriter.flush();
                urlfilewriter.flush();
                logger.error("Получено от wsdl службы "+ config.get("wsdl")+": см. в файле "+new File(".").getAbsolutePath()+"\\..\\"+"wsdl_"+stringDate+".txt");
                logger.error("Получено по адресу "+ config.get("file")+": см. в файле "+new File(".").getAbsolutePath()+"\\..\\"+"url_"+stringDate+".txt");
                wsdlfilewriter.close();
                urlfilewriter.close();
            }

            System.exit(0);
        }catch (Exception e){
            fileWriter.append("Проверка ССВС провалена\r\n");
            logger.error("Проверка провалена. Причина: "+ stackTraceToString(e));
            fileWriter.flush();
            System.exit(1);
        }catch (AssertionError e1){
            String urlStr = new String(url);
            String urlDate = urlStr.split("\n")[3];
            if(urlDate.contains("Дата")){
                urlDate=urlDate.replace("<Дата>","").replace("</Дата>","");
            }else{
                for(String row:urlStr.split("\n")){
                    if(row.contains("Дата")){
                        urlDate=row.replace("<Дата>","").replace("</Дата>","");
                        break;
                    }
                }
            }

            String wsdlStr = new String(wsdl);
            String wsdlDate = wsdlStr.split("\n")[3];
            if(wsdlDate.contains("Дата")){
                wsdlDate=wsdlDate.replace("<Дата>","").replace("</Дата>","");
            }else{
                for(String row:wsdlStr.split("\n")){
                    if(row.contains("Дата")){
                        wsdlDate=row.replace("<Дата>","").replace("</Дата>","");
                        break;
                    }
                }
            }
            SimpleDateFormat answerFormat = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss");
            try {
                System.out.println(answerFormat.parse(urlDate).getHours());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                System.out.println(answerFormat.parse(wsdlDate).getHours());
            } catch (ParseException e) {
                e.printStackTrace();
            }


            logger.error("Проверка провалена. Причина: "+stackTraceToString(e1));



            fileWriter.append("Проверка ССВС провалена\r\n");
            fileWriter.flush();
            System.exit(1);
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
            stringBuilder.append("\r\n");
        }
        return stringBuilder.toString();
    }
}
