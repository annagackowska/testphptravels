package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.drivers.WebDriverCreator;
import utils.drivers.WebDriverCreators;
import utils.drivers.WebDriverProvider;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    private static final String URL = "https://www.phptravels.net/";

    private WebDriver driver;

    private HomePage  homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
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



        homePage.clickOnMyAccount();

        //Actions builder = new Actions(driver);
        //builder.click



        // Actions builder = new Actions(driver);
       // WebElement login = driver.findElement(By.xpath("//html//div[@class='navbar navbar-static-top navbar-default  hidden-lg hidden-md']//li[@id='li_myaccount']//li[1]/a[1]"));

       // builder.moveToElement(login);
       // builder.click();
      //  builder.perform();

        homePage.clickOnLogin();

       loginPage.userLogin(userName, password);

        assertEquals("user jest na stronie", "https://www.phptravels.net/account/", driver.getCurrentUrl());

    }

    @After
    public void tearDown() {
        driver.close();
    }






}
