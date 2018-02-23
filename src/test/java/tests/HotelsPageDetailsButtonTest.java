package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.HotelsPage;
import utils.drivers.WebDriverCreators;
import utils.drivers.WebDriverProvider;
import utils.drivers.waits.CustomWait;
import static org.junit.Assert.assertTrue;



public class HotelsPageDetailsButtonTest {

    private static final String URL = "https://www.phptravels.net/hotels";

    private WebDriver driver;
    private CustomWait customWait;

    private HotelsPage hotelsPage;

    @Before
    public void setUp() {

        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        customWait = new CustomWait(driver);
        driver.manage().window().maximize();

        hotelsPage = PageFactory.initElements(driver,HotelsPage.class);

        driver.get(URL);
    }

    @Test
    public void hotelsPageDetailsButtonTest() {

        WebElement details = driver.findElement(By.linkText("Details"));
        customWait.waitForElementToBeVisible(details);

        assertTrue("details button is not visible",details.isDisplayed());

      // hotelsPage.clickOnDetailsButton();

       //assertEquals("strona ze szczegółami", "https://www.phptravels.net/hotels/singapore/singapore/Rendezvous-Hotels", driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        driver.close();
    }


}
