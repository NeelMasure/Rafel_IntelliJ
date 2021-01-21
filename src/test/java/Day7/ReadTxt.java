package Day7;

import java.io.*;

public class ReadTxt {


    public static void main(String[] args) throws FileNotFoundException {

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Demo.txt";


//        FileReader fr = new FileReader(rpath);
//        BufferedReader br = new BufferedReader(fr);

        BufferedReader br = new BufferedReader(new FileReader(rpath));

    }
}
