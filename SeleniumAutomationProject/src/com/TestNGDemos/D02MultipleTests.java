package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests 
{
	@Test (priority = 1)
	public void Google() 
	{
		System.out.println("Opening google");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		driver.close();
  }
	
	@Test (priority = 2)
	public void Flipkart() 
	{
		System.out.println("Opening flipkart");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
		driver.close();
  }
	@Test (priority = 3)
	public void Amazon() 
	{
		System.out.println("Opening amazon");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
		driver.close();
  }
	
}
