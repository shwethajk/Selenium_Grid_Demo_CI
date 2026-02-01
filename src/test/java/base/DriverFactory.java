package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

// public class DriverFactory {

//     public static WebDriver getDriver(String browser) throws Exception {
//         DesiredCapabilities caps = new DesiredCapabilities();
//         caps.setBrowserName(browser);

//         String gridUrl;

//         if (browser.equalsIgnoreCase("chrome")) {
//             gridUrl = System.getenv().getOrDefault(
//                     "CHROME_GRID_URL",
//                     "http://localhost:4444");
//         } else if (browser.equalsIgnoreCase("firefox")) {
//             gridUrl = System.getenv().getOrDefault(
//                     "FIREFOX_GRID_URL",
//                     "http://localhost:4445");
//         } else {
//             throw new RuntimeException("Unsupported browser: " + browser);
//         }

//         return new RemoteWebDriver(new URL(gridUrl), caps);
//     }
// }

public class DriverFactory {

    public static WebDriver getDriver(String browser) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        String gridUrl = System.getenv().getOrDefault(
                "GRID_URL",
                "http://localhost:4444");

        return new RemoteWebDriver(new URL(gridUrl), caps);
    }
}

// package base;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;

// import java.net.URL;

// public class DriverFactory {

// public static WebDriver getDriver(String browser) throws Exception {
// DesiredCapabilities caps = new DesiredCapabilities();
// caps.setBrowserName(browser);
// // local standalone grid
// // return new RemoteWebDriver(new URL("http://localhost:4444"), caps);

// // Use for both browsers (2 standalone grids)
// // select grid url from environment variable or use default
// String gridUrl = System.getenv().getOrDefault(
// "GRID_URL",
// "http://localhost:4444");
// return new RemoteWebDriver(new URL(gridUrl), caps);
// }
// }
