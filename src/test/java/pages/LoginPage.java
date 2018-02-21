package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(name = "username")
    WebElement userNameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(linkText = "Login")
    WebElement buttonLogin;

    public void userLogin(String user, String password){
        userNameField.sendKeys();
        passwordField.sendKeys();
        buttonLogin.click();

    }


}
