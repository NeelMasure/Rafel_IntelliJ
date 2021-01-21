package Day7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static void main(String[] args) throws IOException {

        //C:\Users\Neel\IdeaProjects\Rafel\TestData

        String apath = "C:\\Users\\Neel\\IdeaProjects\\Rafel\\TestData";

        String rpath= System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"config.properties";
        FileReader fr = new FileReader(rpath);
        Properties prop = new Properties();
        prop.load(fr);
        String u= prop.getProperty("url");
        System.out.println(u);

        }

    }

