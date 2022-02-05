package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
    @FindBy(css = "[id='name']")
    private WebElement name;
    @FindBy(css = "[id='email']")
    private WebElement email;
    @FindBy(css = "[id='password']")
    private WebElement password;
    @FindBy(css = "[id='password_confirmation']")
    private WebElement confirmPassword;
    @FindBy(css = "[id='terms']")
    private WebElement termsCheckbox;
    @FindBy(css = "[type='submit']")
    private WebElement register;

    String fillPassword;


    public Register() {
    }

    public void setName(String nameText) {
        name.click();
        name.sendKeys(nameText);
    }

    public void setEmail(String emailText) {
        email.click();
        email.sendKeys(emailText);

    }

    public void setPassword(String passwordText) {
        password.click();
        password.sendKeys(passwordText);
        fillPassword = passwordText;
    }

    public void setConfirmPassword(){
        confirmPassword.click();
        confirmPassword.sendKeys(fillPassword);
    }

    public void termsCheckboxClick(){
        termsCheckbox.click();
    }

    public void registerClick (){
        register.click();
    }
}
