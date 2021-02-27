package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        System.out.println("Opening Browser");

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
        System.out.println("Logout");

    }

}
