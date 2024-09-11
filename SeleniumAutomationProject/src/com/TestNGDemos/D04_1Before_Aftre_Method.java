package com.TestNGDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04_1Before_Aftre_Method {
	WebDriver driver;

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("\tBefore Method");
	}

	@AfterMethod
	public void AftreMethod() throws IOException {
		int i = 0;
		System.out.println("Title: " + driver.getTitle());
		System.out.println("\tAfter Method");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("ss" +  i + ".jpg"));
		i++;
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("\tBeforeTest");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		System.out.println("After Test");
	}

	@Test(priority = 4)
	public void Google() {
		driver.get("https://www.google.com");
	}

	@Test(priority = 2)
	public void Flipkart() {
		driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 3)
	public void Amazon() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 1)
	public void Mesho() {
		driver.get("https://www.meesho.com/");
	}
}
