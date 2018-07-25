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
  "name": "seleniumeasy.com demo home page is open",
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
  "location": "SeleniumEasyWebsiteStepDefs.seleniumeasy_com_demo_home_page_is_open()"
});
formatter.result({
  "duration": 4978606973,
  "status": "passed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.user_clicks_on_Start_Practising_button()"
});
formatter.result({
  "duration": 752182058,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"btn_basic_example\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565386 (45a059dc425e08165f9a10324bd1380cc13ca363),platform\u003dMac OS X 10.13.3 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.13.0\u0027, revision: \u00272f0d292\u0027, time: \u00272018-06-25T15:24:21.231Z\u0027\nSystem info: host: \u0027Steel\u0027, ip: \u00272a02:c7f:4869:400:90f2:38b1:a37:624e\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.3\u0027, java.version: \u00271.8.0_66\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565386 (45a059dc425e08..., userDataDir: /var/folders/py/096pt7893tj...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: d290a426a2dbbf53bd55823030694a31\n*** Element info: {Using\u003did, value\u003dbtn_basic_example}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat stepdefinitions.SeleniumEasyWebsiteStepDefs.user_clicks_on_Start_Practising_button(SeleniumEasyWebsiteStepDefs.java:25)\n\tat ✽.When user clicks on Start Practising button(SeleniumEasyWebsiteTests.feature:5)\n",
  "status": "failed"
});
formatter.match({
  "location": "SeleniumEasyWebsiteStepDefs.basic_Examples_tab_is_opened_in_the_frame()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("featurefile.feature");
formatter.feature({
  "line": 1,
  "name": "Test Feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Scenario",
  "description": "",
  "id": "test-feature;test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "type given",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "type when",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "type then",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.type_given()"
});
formatter.result({
  "duration": 233157,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.type_when()"
});
formatter.result({
  "duration": 37119,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.typeThen()"
});
formatter.result({
  "duration": 32177,
  "status": "passed"
});
});