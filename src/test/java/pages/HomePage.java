package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right currency_btn']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']")
    private WebElement myAccount;

    @FindBy(xpath = "//html//div[@class='navbar navbar-static-top navbar-default  hidden-lg hidden-md']//li[@id='li_myaccount']//li[1]/a[1]")
    private WebElement login;

    @FindBy(xpath = "//html//div[@class='navbar navbar-static-top navbar-default  hidden-lg hidden-md']//li[@id='li_myaccount']//li[2]/a[1]")
    private WebElement signUp;

    @FindBy(className = "col-md-8 col-sm-9 hidden-xs go-left")
    private WebElement menu;

    public void clickOnMyAccount() {myAccount.click();}
    public void clickOnLogin() {login.click();}
    public void clickOnSignUp() {signUp.click();}

}
