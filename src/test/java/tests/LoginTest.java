package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.drivers.WebDriverCreator;
import utils.drivers.WebDriverCreators;
import utils.drivers.WebDriverProvider;
import utils.drivers.waits.CustomWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginTest {

    private static final String URL = "https://www.phptravels.net/";

    private WebDriver driver;
    private CustomWait customWait;

    private HomePage  homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        customWait = new CustomWait(driver);
        driver.manage().window().maximize();

        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        registerPage = PageFactory.initElements(driver,RegisterPage.class);

        driver.get(URL);

    }

    @Test
    public void loginTest() {

        String userName = "user@phptravels.com";
        String password = "demouser";

        WebElement myAccount = driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-8 col-xs-5 go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']"));
       customWait.waitForElementToBeVisible(myAccount);
       //customWait.waitForElementToBeClickable(myAccount);


        assertTrue("MyAccount button is not visible", myAccount.isDisplayed());

      //  new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav navbar-nav navbar-right currency_btn']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']//li[@id='li_myaccount']")));

       homePage.clickOnMyAccount();

        // Actions builder = new Actions(driver);
       // WebElement login = driver.findElement(By.xpath("//html//div[@class='navbar navbar-static-top navbar-default  hidden-lg hidden-md']//li[@id='li_myaccount']//li[1]/a[1]"));

       // builder.moveToElement(login);
       // builder.click();
      //  builder.perform();



        loginPage.userLogin(userName, password);

        assertEquals("user jest na stronie", "https://www.phptravels.net/account/", driver.getCurrentUrl());

    }

    @After
    public void tearDown() {
        driver.close();
    }






}
