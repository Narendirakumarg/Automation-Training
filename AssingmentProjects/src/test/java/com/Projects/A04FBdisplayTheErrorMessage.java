package com.Projects;

//4. Open https://www.facebook.com/ and try to login using xpath also display the error message

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.Container;
import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A04FBdisplayTheErrorMessage {
	WebDriver driver;
	String expUrl = "http://www.facebook.com";

	@Test(priority = 1)
	public void Username() {
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("killernee@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("admin123"); // For purposely given wrong password
		driver.findElement(By.cssSelector("button[name='login']")).submit();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get(expUrl);
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("Login Failed Message : "
				+ driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText());

		String actUrl = driver.getCurrentUrl();
		System.out.println("Current URL" + actUrl);

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Lanuching Browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
