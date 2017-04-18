import registry.ca.rt.GetTSLInfos;
import registry.ca.rt.GetTSLInfosResponse;
import registry.ca.rt.RegistryService;
import registry.ca.rt.TSLInfo;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Base64;
import java.util.List;

/**
 * Created by a.chebotareva on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        RegistryService registryService = new RegistryService(new URL("http://10.215.0.155/GUC_Registry/Services/RegistryService.asmx?wsdl"));
        List<TSLInfo> list = registryService.getRegistryServiceSoap().getTSLInfos(true).getTSLInfo();
        TSLInfo tslInfo = list.get(0);
        System.out.println((new String(tslInfo.getData()).getBytes()));
        main2();

    }

    public static void main2() throws IOException {
        URL url = new URL("https://e-trust.gosuslugi.ru/CA/DownloadTSL?schemaVersion=0");
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream( new File("data/download.xml"));
        fileOutputStream.getChannel().transferFrom(readableByteChannel,0,Long.MAX_VALUE);
        fileOutputStream.close();
        readableByteChannel.close();
    }
}
