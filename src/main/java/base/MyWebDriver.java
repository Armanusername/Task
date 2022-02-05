package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebDriver {

    private static WebDriver driver;

    private static void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }

}
