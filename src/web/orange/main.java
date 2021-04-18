package web.orange;

import com.sun.xml.internal.ws.api.pipe.Fiber;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\ДЗ JAVA\\WEB_HW\\src\\web\\orange\\orange.xml");
            BufferedReader br = new BufferedReader(fr);
            String a;
            while ((a = br.readLine())!= null) {
                String regex = "<(\\w+)> ((\\w+)||(\\d+)) </(\\w+)>";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(a);
                boolean found = matcher.find();
                if (found){
                    System.out.println(matcher);
                }else {
                    System.out.println("not found");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
