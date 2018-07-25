package stepdefinitions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumUtilities;

public class Guru99SeleniumLearning {
    private SeleniumUtilities seleniumUtilities = new SeleniumUtilities();
    private WebDriver driver = seleniumUtilities.setupChromeDriver();


    @Test
    public void locatorById(){
        seleniumUtilities.openWebPageinChrome(driver,"http://demo.guru99.com/test/facebook.html");
        driver.findElement(By.id("email")).sendKeys("test@test.com");
    }

    @Test
    public void locatorByName(){
        seleniumUtilities.openWebPageinChrome(driver,"http://demo.guru99.com/test/newtours/");
        driver.findElement(By.name("userName")).sendKeys("username");
    }

}
