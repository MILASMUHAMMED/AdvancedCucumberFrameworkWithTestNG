package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;


public class LandingPageStepDefinition {


	
public WebDriver driver;
public String landingPageproductName;
public String offerPageProductName;
TestContextSetup testContextSetup;

public LandingPageStepDefinition(TestContextSetup testContextSetup)
{
	this.testContextSetup = testContextSetup;
}

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/User/Chromedriver/Chromedriver.exe");
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		testContextSetup.driver.manage().window().maximize();
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		LandingPage landingPage = new LandingPage(testContextSetup.driver);
		landingPage.searchItem(shortname);
		Thread.sleep(3000);
		testContextSetup.landingPageproductName = landingPage.getproductName().split("-")[0].trim();
		System.out.println(landingPageproductName + "is extracted from home page.");
	}

}
