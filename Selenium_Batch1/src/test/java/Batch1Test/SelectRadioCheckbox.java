package Batch1Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioCheckbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//https://www.calculator.net/calorie-calculator.html
	
	System.setProperty("webdriver.chrome.driver","C:\\Snehal\\Full Stack Tester\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// webdriver is interface and chromedriver is class
	
	driver.get("https://demo.guru99.com/test/radio.html");
	
	driver.findElement(By.id("vfb-7-1")).click();
	
	driver.findElement(By.id("vfb-6-0")).click();
	driver.findElement(By.id("vfb-6-1")).click();
	driver.findElement(By.id("vfb-6-2")).click();
	}
}
