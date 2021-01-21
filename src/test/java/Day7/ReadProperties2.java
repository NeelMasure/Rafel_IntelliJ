package Day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties2 {

        WebDriver driver;
        @Test
        public void lauch() throws IOException {
            String url = Generic.getValue("url");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
            String title = driver.getTitle();

            Generic.setValue("Page2Title", title);




        }

    }

