package testNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotations3 extends BaseTest {

    @Test(priority = 1)
    public void openURL() throws InterruptedException {

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        System.out.println("URL");

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

    @Test(priority = 8)
    public void paymentGateway() {
        System.out.println("Payment Gateway");

    }

    }