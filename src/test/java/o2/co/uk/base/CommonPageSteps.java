package o2.co.uk.base;

import o2.co.uk.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonPageSteps {

    Browser browser;

    public Browser browser() {
        if (browser == null) {
            WebDriver driver = null;
            String browserType = PropertyReader.getConfigProperties().getProperty("browser");
            if (browserType.equals("chrome")) {
                driver = new ChromeDriver();
            } else if (browserType.equals("Firefox")) {
                driver = new FirefoxDriver();
            }

            browser = new Browser(driver);
        }

        return browser;
    }

    public WebDriver driver() {
        return browser.getDriver();
    }
}
