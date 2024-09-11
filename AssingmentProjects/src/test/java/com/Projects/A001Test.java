package com.Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A001Test 
{
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
		
		// Locators for the elements on the login page
//	    By usernameField = By.xpath("//input[@placeholder='Username']");
//	    By passwordField = By.xpath("//input[@placeholder='Password']");
//	    By loginButton = By.xpath("//button[normalize-space()='Login']");

	    // Method to enter the username
	    public void enterUsername(String username) 
	    {
	        WebElement usernameElement = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	        usernameElement.clear();
	        usernameElement.sendKeys(username);
	    }

	    // Method to enter the password
	    public void enterPassword(String password) 
	    {
	        WebElement passwordElement = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	        passwordElement.clear();
	        passwordElement.sendKeys(password);
	    }

	    // Method to click on the login button
	    public void clickLoginButton() 
	    {
	        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
	    }

	    // Method to perform the login action
	    public void login(String username, String password) 
	    {
	        enterUsername("Admin");
	        enterPassword(password);
	        clickLoginButton();
		
	
	}
	
}
