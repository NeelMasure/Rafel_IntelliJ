package Day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt2 {


    public static void main(String[] args) throws IOException {

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Demo.txt";
        BufferedReader br = new BufferedReader(new FileReader(rpath));

        String x = "";

        while ((x=br.readLine())!=null){
            System.out.println(x);

        }


    }
}
    