package o2.co.uk.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import o2.co.uk.base.CommonPageSteps;
import o2.co.uk.pages.TariffExtrasPage;
import org.openqa.selenium.WebDriver;


public class TariffExtrasPageSteps extends CommonPageSteps {


    private static WebDriver driver= null;

    TariffExtrasPage tariffExtrasPage;

    @Given("^I am on google home page")
    public void i_am_on_google_home_page() throws Throwable {
        browser().navigateToUrl("http://www.google.com");
        tariffExtrasPage = new TariffExtrasPage(driver());
    }

    @When("^I entered a text (.*) in the search box$")
    public void i_entered_a_text_Hello_in_the_search_box(String texttoSearch) throws Throwable {
      tariffExtrasPage.enterDetailsInSearchBox(texttoSearch);

    }

    @And("^I hit the enter key to begin the search$")
            public void i_hit_the_enter_key_to_begin_the_search() throws Throwable {
        tariffExtrasPage.hitEnterKeyFromKeyboard();
    }

    @Then("^I can see respective search results$")
    public void i_can_see_respective_search_results() throws Throwable {

        tariffExtrasPage.shouldSeeRespectiveSearch();

    }


}


