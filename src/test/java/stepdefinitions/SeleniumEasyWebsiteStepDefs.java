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


    @Given("^Simple Form Demo page is open$")
    public void simple_Form_Demo_page_is_open() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enters message in Single Input field$")
    public void user_enters_message_in_Single_Input_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User clicks Show Message button$")
    public void user_clicks_Show_Message_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Entered message is displayed in front of Your Message text$")
    public void entered_message_is_displayed_in_front_of_Your_Message_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

}
