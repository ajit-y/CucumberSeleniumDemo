Feature: Selenium Automation Practice Tests for SeleniumEasy.com

  Scenario: Go to website demo home page and click on Start Practising button
    Given seleniumeasy.com demo home page is open
    When user clicks on Start Practising button
    Then Basic Examples tab is opened in the frame

  Scenario: Test Single Input field on Simple Form demo page
    Given Simple Form Demo page is open
    When User enters message in Single Input field
    And User clicks Show Message button
    Then Entered message is displayed in front of Your Message text

  Scenario: Test Two Input field on Simple Form demo page
    Given Simple Form Demo page is open
    When User enters a number in 'Enter a' textbox in Two Input field
    And User enters a number in 'Enter b' textbox in Two Input field
    And User clicks Get Total button
    Then Sum of numbers is displayed in front of Total a+b text