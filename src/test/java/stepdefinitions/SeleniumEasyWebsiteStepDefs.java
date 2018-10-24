package stepdefinitions;
import cucumber.api.PendingException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page_objects_repository.SeleniumEasyPageObjects;

import org.openqa.selenium.By;
import utilities.SeleniumUtilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SeleniumEasyWebsiteStepDefs {

    private SeleniumUtilities seleniumUtilities = new SeleniumUtilities();
    private SeleniumEasyPageObjects seleniumEasyPageObjects = new SeleniumEasyPageObjects();
    private WebDriver driver = seleniumUtilities.setupChromeDriver();

    @After
    public void afterTestActions(){
        seleniumUtilities.quitWebdriver();
    }

    @Given("^Page with url \"([^\"]*)\" is open$")
    public void pageWithUrlIsOpen(String url) {
        seleniumUtilities.openWebPageinChrome(driver,url);
    }

    @When("^user clicks on Start Practising button$")
    public void user_clicks_on_Start_Practising_button() {
        driver.findElement(By.id(seleniumEasyPageObjects.startPractisingButtonId)).click();
    }

    @Then("^Basic Examples tab is opened in the frame$")
    public void basic_Examples_tab_is_opened_in_the_frame() {

    }

    @When("^User enters message in Single Input field$")
    public void user_enters_message_in_Single_Input_field() {
        driver.findElement(By.cssSelector(seleniumEasyPageObjects.singleInputFieldEnterMessage)).sendKeys("single input field message");
    }

    @When("^User clicks Show Message button$")
    public void user_clicks_Show_Message_button() {
        driver.findElement(By.cssSelector(seleniumEasyPageObjects.singleInputFieldShowMessageButton)).click();
    }

    @Then("^Entered message is displayed in front of Your Message text$")
    public void entered_message_is_displayed_in_front_of_Your_Message_text() {
        String messageText = driver.findElement(By.cssSelector(seleniumEasyPageObjects.getSingleInputFieldMessageDisplay)).getText();
        System.out.println(messageText);
        assertTrue("Text Matching",messageText.equals("single input field message"));
    }

    @When("^User Click on 'Check All'$")
    public void user_Click_on_Check_All() {

    }

    @Then("^all checkboxes are selected at once$")
    public void all_checkboxes_are_selected_at_once() {

    }

    @Then("^Button will change to 'Uncheck All'$")
    public void button_will_change_to_Uncheck_All() {

    }

    @When("^When user uncheck at least one checkbox$")
    public void when_user_uncheck_at_least_one_checkbox() {

    }

    @Then("^Button will change to 'Check All'$")
    public void button_will_change_to_Check_All() {

    }

}
