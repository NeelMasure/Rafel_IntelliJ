package Day7;

import java.io.*;
import java.util.Properties;

public class Generic {


    public static String getValue(String key) throws IOException {

        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
        FileReader fr = new FileReader(rpath);
        Properties prop = new Properties();
        prop.load(fr);
        String value = prop.getProperty(key);
        return value;

    }

    {

    }

    public static void setValue(String key, String value) throws IOException {
        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
        FileWriter fos =new FileWriter(rpath,true);
        Properties prop = new Properties();
        prop.setProperty(key, value);
        prop.store(fos, "");

    }
}



