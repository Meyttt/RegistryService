

import java.io.*;
import java.util.Base64;

/**
 * Created by a.chebotareva on 18.04.2017.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("data/soap.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        try{
            while((line=reader.readLine())!=null){
                stringBuilder.append(line);
            }
        }finally {
            reader.close();
        }
        (new FileOutputStream("data/test.xml")).write(Base64.getDecoder().decode(stringBuilder.toString().getBytes()));
    }

}
