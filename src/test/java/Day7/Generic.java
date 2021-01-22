package Day7;

import com.github.javafaker.Faker;
import org.ini4j.Ini;

import java.io.*;
import java.util.Locale;
import java.util.Properties;

public class Generic {


    public Generic() throws FileNotFoundException {
    }

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
        FileWriter fos = new FileWriter(rpath, true);
        Properties prop = new Properties();
        prop.setProperty(key, value);
        prop.store(fos, "");

    }

    public static void setValue(String header, String key, String value) throws IOException {

        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "data.ini";
        FileOutputStream fos = new FileOutputStream(rpath, true);
        Ini ini = new Ini();
        ini.put(header, key, value);
        ini.store(fos);


    }

    public static String getValue(String header, String key) throws IOException {
        String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "data.ini";
        File file;
        FileInputStream fis = new FileInputStream(rpath);
        Ini ini = new Ini();
        ini.load(fis);
        String value = ini.get(header, key);
        return value;
    }


    public static String getEmail() {
        Locale lc = new Locale("en-IND");
        Faker fak = new Faker(lc);
        String fn = fak.name().fullName();
        String email = fn.replace(" ", "").replace(".", "") + "@gmail.com";
        return email;
    }

    public static String getName() {
        Locale lc = new Locale("en-IND");
        Faker fak = new Faker(lc);
        String fn = fak.name().fullName();
        return fn;


    }
}



