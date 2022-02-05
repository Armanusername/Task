import base.MyWebDriver;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    public WebDriver driver (){
        return MyWebDriver.getDriver();
    }
}
