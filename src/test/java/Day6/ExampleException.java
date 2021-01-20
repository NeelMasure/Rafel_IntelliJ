package Day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExampleException {

    WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.indusind.com/in/en/personal.html");
        Thread.sleep(3000);

        try{
            driver.findElement(By.xpath("(//a[@class='close'])[1]")).click();
        }catch (Exception e){

        }
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='About Us']")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
