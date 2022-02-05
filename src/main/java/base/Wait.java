package base;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {

    public static void wait_url_Matches (String url){
        WebDriverWait wait = new WebDriverWait(MyWebDriver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlMatches(url));
    }
}
