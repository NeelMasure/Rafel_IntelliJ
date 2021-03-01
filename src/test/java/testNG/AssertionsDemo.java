package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo extends BaseTest {

        @Test
    public void demoAssertion() {
        driver.get("https://www.google.com");
        System.out.println("Starting...");

        String title = driver.getTitle();

        Assert.assertEquals(title, "Facebook", "Mismatch");

        System.out.println("Ending...");

    }

    @Test
    public void demo() {

        System.out.println("Just Demo");

    }
}
