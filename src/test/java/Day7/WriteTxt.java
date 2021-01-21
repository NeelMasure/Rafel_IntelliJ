package Day7;

import java.io.*;

public class WriteTxt {


    public static void main(String[] args) throws IOException {

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Demo.txt";

        File file;
        FileWriter fw = new FileWriter(rpath);
        BufferedWriter bw =new BufferedWriter(fw);

        bw.write("Happy Learning Appium");
        bw.flush();
        bw.close();



        }


    }
    