package o2.co.uk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DetailsPageSteps {




    private  static WebDriver driver = null;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//vishalloke//IdeaProjects//pageObjectModel//src//main//resources//driver//linux//chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");


    }







}
