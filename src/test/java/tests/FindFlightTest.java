package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.FlightsPage;
import utils.drivers.WebDriverCreators;
import utils.drivers.WebDriverProvider;

public class FindFlightTest {

    private static final String URL = "https://www.phptravels.net/flightst";

    private WebDriver driver;

    private FlightsPage flightsPage;

    @Before
    public void setUp() {

        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.manage().window().maximize();

        flightsPage = PageFactory.initElements(driver, FlightsPage.class);

        driver.get(URL);
    }

    @Test
    public void findFlightTest() {

        String departureCity = "Dubaj";


        flightsPage.clickOnOneWayButton();
        flightsPage.sendKeysOnDepartureCity();

    }

    @After
    public void tearDown() {
        driver.close();
    }





}
