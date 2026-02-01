package tests;

import base.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

public class GoogleTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setup(String browser) throws Exception {
        driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

// public class GoogleTest {

// // @Parameters("browser")
// // @Test
// // public void openGoogle(String browser) throws Exception {
// // WebDriver driver = DriverFactory.getDriver(browser);
// // driver.get("https://www.google.com");
// // System.out.println("Title is: " + driver.getTitle());
// // driver.quit();
// // }

// @Test
// @Parameters("browser")
// public void openGoogle(String browser) throws Exception {
// WebDriver driver = DriverFactory.getDriver(browser);

// driver.manage().timeouts()
// .pageLoadTimeout(Duration.ofSeconds(20));

// driver.get("https://www.google.com");
// System.out.println("Title is: " + driver.getTitle());

// driver.quit();
// }

// }

// Both

// <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
// <suite name="GridSuite" parallel="tests" thread-count="2">
// <test name="ChromeTest">
// <parameter name="browser" value="chrome"/>
// <classes>
// <class name="tests.GoogleTest"/>
// </classes>
// </test>
// <test name="FirefoxTest">
// <parameter name="browser" value="firefox"/>
// <classes>
// <class name="tests.GoogleTest"/>
// </classes>
// </test>
// </suite>

// ONly google

// <suite name="GridSuite" parallel="tests" thread-count="1">
// <test name="ChromeTest">
// <parameter name="browser" value="chrome"/>
// <classes>
// <class name="tests.GoogleTest"/>
// </classes>
// </test>
// </suite>
