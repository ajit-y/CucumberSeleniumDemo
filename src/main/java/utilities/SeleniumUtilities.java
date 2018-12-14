package utilities;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtilities {

    public WebDriver setupChromeDriver() {
        ChromeDriverManager.getInstance().setup();
        return new ChromeDriver();
    }

    public void quitWebdriver(WebDriver driver) {
            driver.quit();
    }

    public void openWebPageinChrome(WebDriver driver, String url) {
        driver.get(url);
    }

}
