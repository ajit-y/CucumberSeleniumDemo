$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SeleniumEasyWebsiteTests.feature");
formatter.feature({
  "line": 1,
  "name": "Selenium Automation Practice Tests for SeleniumEasy.com",
  "description": "",
  "id": "selenium-automation-practice-tests-for-seleniumeasy.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Go to website demo home page and click on Start Practising button",
  "description": "",
  "id": "selenium-automation-practice-tests-for-seleniumeasy.com;go-to-website-demo-home-page-and-click-on-start-practising-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Page with url \"http://www.seleniumeasy.com/test/\" is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Start Practising button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Basic Examples tab is opened in the frame",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.seleniumeasy.com/test/",
      "offset": 15
    }
  ],
  "location": "SeleniumEasyWebsiteStepDefs.pageWithUrlIsOpen(String)"
});
formatter.result({
  "duration": 6619775589,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.user_clicks_on_Start_Practising_button()"
});
formatter.result({
  "duration": 72304901,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.basic_Examples_tab_is_opened_in_the_frame()"
});
formatter.result({
  "duration": 26511,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test Single Input field on Simple Form demo page",
  "description": "",
  "id": "selenium-automation-practice-tests-for-seleniumeasy.com;test-single-input-field-on-simple-form-demo-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Page with url \"https://www.seleniumeasy.com/test/basic-first-form-demo.html\" is open",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters message in Single Input field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks Show Message button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Entered message is displayed in front of Your Message text",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.seleniumeasy.com/test/basic-first-form-demo.html",
      "offset": 15
    }
  ],
  "location": "SeleniumEasyWebsiteStepDefs.pageWithUrlIsOpen(String)"
});
formatter.result({
  "duration": 3376350666,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.user_enters_message_in_Single_Input_field()"
});
formatter.result({
  "duration": 154596530,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.user_clicks_Show_Message_button()"
});
formatter.result({
  "duration": 79508335,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.entered_message_is_displayed_in_front_of_Your_Message_text()"
});
formatter.result({
  "duration": 31369870,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Test Multiple Checkbox Form demo page",
  "description": "",
  "id": "selenium-automation-practice-tests-for-seleniumeasy.com;test-multiple-checkbox-form-demo-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Page with url \"https://www.seleniumeasy.com/test/basic-checkbox-demo.html\" is open",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User Click on \u0027Check All\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "all checkboxes are selected at once",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Button will change to \u0027Uncheck All\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "When user uncheck at least one checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Button will change to \u0027Check All\u0027",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.seleniumeasy.com/test/basic-checkbox-demo.html",
      "offset": 15
    }
  ],
  "location": "SeleniumEasyWebsiteStepDefs.pageWithUrlIsOpen(String)"
});
formatter.result({
  "duration": 3433116948,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.user_Click_on_Check_All()"
});
formatter.result({
  "duration": 30118,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.all_checkboxes_are_selected_at_once()"
});
formatter.result({
  "duration": 17259,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.button_will_change_to_Uncheck_All()"
});
formatter.result({
  "duration": 15589,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.when_user_uncheck_at_least_one_checkbox()"
});
formatter.result({
  "duration": 17102,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.button_will_change_to_Check_All()"
});
formatter.result({
  "duration": 14659,
  "status": "passed"
});
});