package o2.co.uk.pages;

import o2.co.uk.base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TariffExtrasPage {

    static WebDriver driver;


    public TariffExtrasPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetailsInSearchBox(String search_text){

        driver.findElement(By.className("gsfi")).sendKeys(search_text);

    }

   public void enter_the_key_for_search(){
       WebElement textbox = driver.findElement(By.className("gsfi"));
       textbox.sendKeys(Keys.RETURN);
   }

   public void should_see_respective_search(){

       driver.getPageSource().contains("results");
   }

}
