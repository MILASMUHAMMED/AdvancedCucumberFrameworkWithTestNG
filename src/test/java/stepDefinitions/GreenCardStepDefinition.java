package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenCardStepDefinition {
public WebDriver driver;
public String landingPageproductName;
public String offerPageProductName;

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/User/Chromedriver/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(3000);
		landingPageproductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(landingPageproductName + "is extracted from home page.");
	}
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_same_shortname_in_offers_page(String shortname) throws InterruptedException {
		
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();		
		driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
		Thread.sleep(3000);
		offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	}
	
    @And("^validate productname in offers page matches with landing page$")
    public void validate_productname_in_offers_page_matches_with_landing_page() throws Throwable {
    	Assert.assertEquals(offerPageProductName, landingPageproductName);
    	driver.quit();
    }
}
