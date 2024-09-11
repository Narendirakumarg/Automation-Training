package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04Before_Aftre_Method {
	WebDriver driver;

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("\tBefore Method");
	}

	@AfterMethod
	public void AftreMethod() {
		System.out.println("Title: " + driver.getTitle());
		System.out.println("\tAfter Method");
	}

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
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
