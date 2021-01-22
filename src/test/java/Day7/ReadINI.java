package Day7;

import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadINI {

    public static void main(String[] args) throws IOException {
        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "data.ini";
        FileInputStream fis = new FileInputStream(rpath);
        Ini ini =new Ini();
        ini.load(fis);
        String val = ini.get("TC001","url");
        System.out.println(val);
    }

}
