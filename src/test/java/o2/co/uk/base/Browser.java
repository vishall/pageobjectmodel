package o2.co.uk.base;

import org.openqa.selenium.WebDriver;

public class Browser {

   private final WebDriver driver;

    public Browser(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
