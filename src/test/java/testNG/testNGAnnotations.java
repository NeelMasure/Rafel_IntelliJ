package testNG;


import org.testng.annotations.*;
import org.testng.annotations.Test;

public class testNGAnnotations {

    @BeforeTest
    public void openBrowser() {
        System.out.println("Opening Browser");

        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Before Method");
    }

        @AfterMethod
        public void afterMethod() {
            System.out.println("After Method");
        }

    @Test(priority = 1)
    public void openURL() {
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

    }
