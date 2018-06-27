package o2.co.uk.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import o2.co.uk.base.CommonPageSteps;
import o2.co.uk.pages.TariffExtrasPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TariffExtrasPageSteps extends CommonPageSteps {


    private static WebDriver driver = null;

    TariffExtrasPage tariffExtrasPage;

    @Given("^I am on google home page")
    public void i_am_on_google_home_page() throws Throwable {
        browser().navigateToUrl("http://www.google.com");
        tariffExtrasPage = new TariffExtrasPage(driver());
    }

    @When("^I click in the search text box$")
    public void i_click_in_the_search_text_box() throws Throwable {
      tariffExtrasPage.enterDetailsInSearchBox("Hello");

    }

    @And("^I entered a text to search box$")
    public void i_entered_a_text_to_search_box() throws Throwable {
        tariffExtrasPage.enter_the_key_for_search();
    }

    @Then("^I can see respective search results$")
    public void i_can_see_respective_search_results() throws Throwable {

        tariffExtrasPage.should_see_respective_search();

    }


}


