package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLaunch {
	WebDriver driver;
	@Given("Launch Browser and enter url")
	public void launch_Browser_and_enter_url() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Snehal\\Full Stack Tester\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	@When("Enter user id as {string}")
	public void enter_user_id_as(String useriD) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[5]/label/div/div[1]")).sendKeys(useriD);
	}

	@When("User click on next button")
	public void user_click_on_next_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div/div[6]/div")).click();
	}

	@Then("Enter passowrd as {string}")
	public void enter_passowrd_as(String password) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}


}
