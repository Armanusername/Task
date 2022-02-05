import base.Helper;
import base.Wait;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Register;


public class RegistrationTest extends BaseTest {
    Register registrationPage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setup() {
        driver().get("https://qa.smclk.net/register");
        driver().manage().window().maximize();
        registrationPage = PageFactory.initElements(driver(), Register.class);
    }

    @Test(testName = "Test registration using positive data")
    public void registrationTest() {

        String verifyPageURL = "https://qa.smclk.net/email/verify";

        registrationPage.setName("Arsen" + Helper.randomNumber());
        registrationPage.setEmail("arsen" + Helper.randomNumber() + "@gmail.com");
        registrationPage.setPassword("Arsen12345");
        registrationPage.setConfirmPassword();
        registrationPage.termsCheckboxClick();
        registrationPage.registerClick();
        Wait.wait_url_Matches(verifyPageURL);
        String getVerifyURL = driver().getCurrentUrl();
        softAssert.assertEquals(verifyPageURL, getVerifyURL);
    }

    @AfterTest
    public void tearDown() {
        driver().quit();
    }
}
