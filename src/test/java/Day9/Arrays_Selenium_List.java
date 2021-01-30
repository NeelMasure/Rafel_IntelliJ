package Day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.util.*;

public class Arrays_Selenium_List {
    WebDriver driver;

    @Test
    public void openBroswer() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");
        List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

        ArrayList<String>empty = new ArrayList<>();

        for (WebElement ele:lang){
            empty.add(ele.getText());
        }
        System.out.println("Un Sorted :"+ empty);
        Collections.sort(empty);
        System.out.println("Sorted :"+ empty);

//        Iterator<WebElement> l = lang.iterator();
//        while (l.hasNext()) {
//            System.out.println(l.next().getText());
//        }
//
//        System.out.println("=======================================");
//        ListIterator<WebElement> ll = lang.listIterator();
//        while (ll.hasPrevious()) {
//            System.out.println(ll.previous().getText());
//
//
//        }

        driver.quit();

    }
}
