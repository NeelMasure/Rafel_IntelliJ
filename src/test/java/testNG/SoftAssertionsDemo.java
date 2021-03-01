package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsDemo extends BaseTest {

        @Test
    public void demoAssertion() {
        driver.get("https://www.google.com");
        System.out.println("Starting...");

        SoftAssert sf = new SoftAssert();
        String title = driver.getTitle();

        sf.assertEquals(title, "Facebook", "Mismatch");

        System.out.println("Ending...");
            sf.assertAll();

    }

    @Test
    public void demo() {

        System.out.println("Just Demo");

    }
}
