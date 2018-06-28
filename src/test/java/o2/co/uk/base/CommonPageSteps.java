package o2.co.uk.base;

import cucumber.api.java.Before;
import o2.co.uk.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonPageSteps {

    private final PropertyReader propertyReader = new PropertyReader("config.properties");

    Browser browser;

    public Browser browser() {
        if (browser == null) {
            WebDriver driver = null;
            String browserType = propertyReader.getProperty("browser");
            if (browserType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserType.equalsIgnoreCase("Firefox")) {
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
