public class DriverFactory {

    public static WebDriver getDriver(String browser) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName(browser);

        String gridUrl;

        if (browser.equalsIgnoreCase("chrome")) {
            gridUrl = System.getenv().getOrDefault(
                    "CHROME_GRID_URL",
                    "http://localhost:4444"
            );
        } else if (browser.equalsIgnoreCase("firefox")) {
            gridUrl = System.getenv().getOrDefault(
                    "FIREFOX_GRID_URL",
                    "http://localhost:4445"
            );
        } else {
            throw new RuntimeException("Unsupported browser: " + browser);
        }

        return new RemoteWebDriver(new URL(gridUrl), caps);
    }
}
