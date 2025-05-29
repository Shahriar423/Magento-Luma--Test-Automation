package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver;

    public DriverFactory() {
    }

    public static WebDriver initDriver() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shahriar Shimul\\IdeaProjects\\magento\\src\\test\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}
