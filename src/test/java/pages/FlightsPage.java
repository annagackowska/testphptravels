package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsPage {

    @FindBy(linkText = "One way")
    WebElement oneWayButton;

    @FindBy(linkText = "Return")
    WebElement returnButton;

    @FindBy(linkText = "Multi city")
    WebElement multiCityButton;

    @FindBy(linkText = "Enter departure city")
    WebElement departuerCityField;

    @FindBy(linkText = "Enter arrival city")
    WebElement arrivalCityField;

    @FindBy(id="depart-date-link-6901dd08-c63d-4592-8ed1-1b8404fd8f04")
    WebElement date;

    public void clickOnOneWayButton() {oneWayButton.click();}
    public void clickOnReturnButton() {returnButton.click();}
    public void clickOnMultiCityButton() {multiCityButton.click();}
    public void clickOnDepartureCity() {departuerCityField.click();}
    public void sendKeysOnDepartureCity() {departuerCityField.sendKeys();}
    public void clickOnArrivalCity() {arrivalCityField.click();}
    public void sendKeysOnArrivalCity() {arrivalCityField.sendKeys();}
    public void clickOnDate() {date.click();}


}
