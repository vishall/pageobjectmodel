package o2.co.uk.pages;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TariffExtrasPageSteps {


    private static WebDriver driver = null;

    @Given("^I am on google home page$")
    public void i_am_on_google_home_page() throws Throwable {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");


    }

    @When("^I click in the search text box$")
    public void i_click_in_the_search_text_box() throws Throwable {

        driver.findElement(By.className("gsfi")).sendKeys("Hello");

    }

    @And("^I entered a text to search box$")
    public void i_entered_a_text_to_search_box() throws Throwable {
        WebElement textbox = driver.findElement(By.className("gsfi"));
        textbox.sendKeys(Keys.RETURN);
    }

    @Then("^I can see respective search results$")
    public void i_can_see_respective_search_results() throws Throwable {

        driver.getPageSource().contains("results");

    }


}


