package stepdefinitions;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page_objects_repository.SeleniumEasyPageObjects;

import org.openqa.selenium.By;
import utilities.SeleniumUtilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;

import java.util.Calendar;

import static org.junit.Assert.assertTrue;

public class SeleniumEasyWebsiteStepDefs {

    private SeleniumUtilities seleniumUtilities = new SeleniumUtilities();
    private SeleniumEasyPageObjects seleniumEasyPageObjects = new SeleniumEasyPageObjects();
    private WebDriver driver = seleniumUtilities.setupChromeDriver();

    /*
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Setup and Teardown
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */

    @After
    public void afterTestActions(){
        seleniumUtilities.quitWebdriver(driver);
    }


    @Given("^Page with url \"([^\"]*)\" is open$")
    public void pageWithUrlIsOpen(String url) {
        seleniumUtilities.openWebPageinChrome(driver,url);
    }


    /*
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    TEST HOME PAGE
    https://www.seleniumeasy.com/test/
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */

    @When("^user clicks on Start Practising button$")
    public void user_clicks_on_Start_Practising_button() {
        driver.findElement(By.id(seleniumEasyPageObjects.startPractisingButtonId)).click();
    }

    @Then("^Basic Examples tab is opened in the frame$")
    public void basic_Examples_tab_is_opened_in_the_frame() {

    }


    /*
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    INPUT FORM PAGE
    https://www.seleniumeasy.com/test/basic-first-form-demo.html
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */

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


    /*
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    CHECKBOX PAGE
    https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */

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

    /*
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    Bootstrap Date Pickers Example
    https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html
    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    */

    @When("^User clicks icon for calendar$")
    public void user_clicks_icon_for_calendar() {
        driver.findElement(By.cssSelector(seleniumEasyPageObjects.bootstrapDatePickerDemoDateexampleSelectDate)).click();
    }

    @Then("^Calendar window is displayed$")
    public void calendar_window_is_displayed() {
        assertTrue(driver.findElement(By.cssSelector(seleniumEasyPageObjects.bootstrapDatePickerDemoDateexampleCalendarOpen)).isDisplayed());
    }

    @Test
    @Then("^Calendar - Future dates are disabled$")
    public void calendar_Future_dates_are_disabled() throws Throwable {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getFirstDayOfWeek());
    }

    @Then("^Calendar - Days Of Week Disabled- Sunday$")
    public void calendar_Days_Of_Week_Disabled_Sunday() throws Throwable {

    }

    @Then("^Calendar - Week Starts from Monday$")
    public void calendar_Week_Starts_from_Monday() throws Throwable {

    }

    @When("^User Click on 'Today'$")
    public void user_Click_on_Today() throws Throwable {

    }

    @Then("^Calendar - select Current date$")
    public void calendar_select_Current_date() throws Throwable {

    }

    @When("^User Click on Clear button$")
    public void user_Click_on_Clear_button() throws Throwable {

    }

    @Then("^Calendar - clear the date entered$")
    public void calendar_clear_the_date_entered() throws Throwable {

    }



}
