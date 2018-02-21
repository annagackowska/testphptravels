package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.drivers.WebDriverCreators;
import utils.drivers.WebDriverProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuTest {

    private static final String URL = "https://www.phptravels.net/";

    private WebDriver driver;

    private HomePage homePage;

    @Before
    public void setUp() {
        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();

        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.get(URL);
    }


    @Test
    public void menuContainsAllElements() {

        List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='col-md-8 col-sm-9 hidden-xs go-left']"));
        List<String> stringElements = new ArrayList<>();

        for (WebElement element : listOfElements) {
            stringElements.add(element.getText());
        }


        List<String> expectedOptions = Arrays.asList("HOTELS", "FLIGHTS", "TOURS", "CARS", "OFFERS", "VISA", "BLOG");

        stringElements.containsAll(expectedOptions);

    }

    @After
    public void tearDown() {
        driver.close();
    }
}
