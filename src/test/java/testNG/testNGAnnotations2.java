package testNG;


import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyReports.class)
public class testNGAnnotations2 extends BaseTest{

    @Test(priority = 1)
    public void openURL() throws InterruptedException {

        driver.get("https://www.amazon.com");
        Thread.sleep(4000);
        System.out.println("URL");
        Reporter.log("User is on "+driver.getCurrentUrl());
        Reporter.log("Page Title"+driver.getTitle());
        Reporter.log("Page Source"+driver.getPageSource());

    }
    @Test(priority = 2)
    public void Login() {
        System.out.println("Login");

    }

    @Test(priority = 3)
    public void searchProduct() {
        System.out.println("SearchProduct");

    }
    @Test(priority = 4)
    public void plp() {
        System.out.println("Product listing page");

    }
    @Test(priority = 5)
    public void pdp() {
        System.out.println("Product Discription Page");

    }
    @Test(priority = 6)
    public void addtoCart() {
        System.out.println("Add to Cart");

    }
    @Test(priority = 7)
    public void addAddress() {
        System.out.println("Add Address");


    }


    }

