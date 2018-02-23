package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsPage {

    @FindBy(xpath = "//div[@class='col-md-6 col-sm-8 col-xs-5 go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']")
    WebElement detailsButton;

    public void clickOnDetailsButton(){detailsButton.click();}
}
