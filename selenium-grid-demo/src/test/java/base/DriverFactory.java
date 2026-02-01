package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class DriverFactory {

    public static WebDriver getDriver(String browser) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);
        // return new RemoteWebDriver(new URL("http://localhost:4444"), caps); // local
        // standalone grid

        // select grid url from environment variable or use default
        String gridUrl = System.getenv().getOrDefault(
                "GRID_URL",
                "http://localhost:4444");

        return new RemoteWebDriver(new URL(gridUrl), caps);

    }
}
