package o2.co.uk.pages;


import o2.co.uk.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class TariffExtrasPage {

    static WebDriver driver;

    private final PropertyReader propertyReader = new PropertyReader("config.properties");

    By searchTextbox = By.className("gsfi");

    private final String result = "Results";

    public TariffExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    @Test
    public void enterDetailsInSearchBox(String textToSearch){

        driver.findElement(searchTextbox).sendKeys(textToSearch);

    }

    @Test
   public void hitEnterKeyFromKeyboard(){
       WebElement textbox = driver.findElement(searchTextbox);
       textbox.sendKeys(Keys.RETURN);
   }
   @Test
   public void shouldSeeRespectiveSearch(){

       driver.getPageSource().contains(result);
   }

}
