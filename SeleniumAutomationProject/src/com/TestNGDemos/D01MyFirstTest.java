package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01MyFirstTest {
	@Test
	public void openSelenium() {
		System.out.println("Opening Selenium");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@Test
	public void hellow()

	{
		System.out.println("Welcome");
	}
}
