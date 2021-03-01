package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Test_param {

    @Test(priority = 1)
    public void searchProduct() {
        boolean product = false;
        if (product==false)
            Assert.fail("Fail");
        System.out.println("SearchProduct");

    }
    @Test(dependsOnMethods = "SearchProduct")
    public void plp() {
        System.out.println("Product listing page");

    }
    @Test(dependsOnMethods = "plp")
    public void pdp() {
        System.out.println("Product Discription Page");

    }

}
