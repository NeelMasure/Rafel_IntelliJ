package testNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGAnnotations2 extends BaseTest{

    @Test(priority = 1)
    public void openURL() {

        driver.get("https://www.amazon.com");
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


    }

