package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FacebookFeature {

	WebDriver driver;
	
	@Given("The Facebook website launch")
	public void the_Facebook_website_launch() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Snehal\\Full Stack Tester\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("Check user id and password field present")
	public void check_user_id_and_password_field_present() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User ID field present : "+driver.findElement(By.id("email")).isDisplayed());
		System.out.println("Password field present : "+ driver.findElement(By.id("pass")).isDisplayed());
	}

	@Then("Enter user {string} and {string}")
	public void enter_user_and(String userid, String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("Close browser")
	public void closeBrowser() {
		driver.close();
	}
	
	
}
