package stepdefinitions;
import org.openqa.selenium.WebDriver;
import page_objects_repository.SeleniumEasyPageObjects;

import org.openqa.selenium.By;
import utilities.SeleniumUtilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

public class SeleniumEasyWebsiteStepDefs {

    private SeleniumUtilities seleniumUtilities = new SeleniumUtilities();
    private SeleniumEasyPageObjects seleniumEasyPageObjects = new SeleniumEasyPageObjects();
    private WebDriver driver = seleniumUtilities.setupChromeDriver();


    @Given("^seleniumeasy\\.com demo home page is open$")
    //@Test
    public void seleniumeasy_com_demo_home_page_is_open() {
        seleniumUtilities.openWebPageinChrome(driver,"http://www.seleniumeasy.com/test/");
    }

    @When("^user clicks on Start Practising button$")
    public void user_clicks_on_Start_Practising_button() {
        driver.findElement(By.id(seleniumEasyPageObjects.startPractisingButtonId)).click();

    }

    @Then("^Basic Examples tab is opened in the frame$")
    public void basic_Examples_tab_is_opened_in_the_frame() {

    }

}
