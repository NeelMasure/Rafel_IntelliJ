package Day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class GetKeysFromProperties {

        WebDriver driver;
        @Test
        public void lauch() throws IOException {
            String url = Generic.getValue("url");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            String title = driver.getTitle();

            String rpath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
            FileReader fos =new FileReader(rpath);
            Properties prop = new Properties();
            prop.load(fos);
            Set<Object> ky = prop.keySet();
            System.out.println(ky);


            Generic.setValue("Page2Title", title);




        }

    }

