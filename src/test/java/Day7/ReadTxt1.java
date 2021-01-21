package Day7;

import java.io.*;

public class ReadTxt1 {


    public static void main(String[] args) throws IOException {

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"Demo.txt";


//        FileReader fr = new FileReader(rpath);
//        BufferedReader br = new BufferedReader(fr);

        BufferedReader br = new BufferedReader(new FileReader(rpath));

        for (int i =1; i<12; i++){
            System.out.println(br.readLine());
        }


    }
}
