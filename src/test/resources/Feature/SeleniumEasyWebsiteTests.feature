Feature: Selenium Automation Practice Tests for SeleniumEasy.com

  Scenario: Go to website demo home page and click on Start Practising button
    Given Page with url "http://www.seleniumeasy.com/test/" is open
    When user clicks on Start Practising button
    Then Basic Examples tab is opened in the frame

  Scenario: Test Single Input field on Simple Form demo page
    Given Page with url "https://www.seleniumeasy.com/test/basic-first-form-demo.html" is open
    When User enters message in Single Input field
    And User clicks Show Message button
    Then Entered message is displayed in front of Your Message text

  Scenario: Test Multiple Checkbox Form demo page
    Given Page with url "https://www.seleniumeasy.com/test/basic-checkbox-demo.html" is open
    When User Click on 'Check All'
    Then all checkboxes are selected at once
    And Button will change to 'Uncheck All'
    When When user uncheck at least one checkbox
    Then Button will change to 'Check All'

