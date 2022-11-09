package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFeature {
	WebDriver driver;
	
	@Given("The Google Website Launch")
	public void the_Google_Website_Launch() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Snehal\\Full Stack Tester\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		// webdriver is interface and chromedriver is class
		
		driver.get("https://www.google.com");
	}

	@When("Search bar is visible")
	public void search_bar_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(driver.findElement(By.name("q")).isDisplayed());
	}

	@Then("Enter text SRM")
	public void enter_text_TJ() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("SRM");
	}
	
	@Then("Enter text Snehal")
	public void enter_text_Snehal() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Snehal");
	}
}
