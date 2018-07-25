package utilities;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtilities {

    private WebDriver driver;


    public WebDriver setupChromeDriver() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public void quitWebdriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void openWebPageinChrome(WebDriver driver, String url) {
        driver.get(url);
    }

}
