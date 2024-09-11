package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D06LoginToOHRM {
	WebDriver driver;

	@Test(dataProvider = "getLoginData", dataProviderClass = com.MyTests.D05ReadLoginData.class)
	public void loginToOHRM(String un, String ps) throws IOException{
		System.out.println(un + "\t" + ps);
		//Write the code for login
	}
	
	@AfterMethod
	public void logout()
	{
		//Write the code for logout
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}