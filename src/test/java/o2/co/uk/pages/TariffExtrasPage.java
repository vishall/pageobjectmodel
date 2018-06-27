package o2.co.uk.pages;


import o2.co.uk.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TariffExtrasPage {

    static WebDriver driver;

    private final PropertyReader propertyReader = new PropertyReader("config.properties");

    private final By searchTextbox = By.className(propertyReader.getProperty("search.textbox"));

    private final String texttoSearch = propertyReader.getProperty("text.to.search");

    private final String searchResult = propertyReader.getProperty("search.result");

    public TariffExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetailsInSearchBox(){

        driver.findElement(searchTextbox).sendKeys(texttoSearch);

    }

   public void enter_the_key_for_search(){
       WebElement textbox = driver.findElement(searchTextbox);
       textbox.sendKeys(Keys.RETURN);
   }

   public void should_see_respective_search(){

       driver.getPageSource().contains(searchResult);
   }

}
