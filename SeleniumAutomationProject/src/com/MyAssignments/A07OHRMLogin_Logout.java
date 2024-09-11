package com.MyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A07OHRMLogin_Logout {
	WebDriver driver;

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Test
	public void loginToOHRM2() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@Test
	public void loginToOHRM3() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("shrutika");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("shrutika123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login successful!!!");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
		} else {
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"))
					.getText());
		}
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
		System.out.println("\tAfterTest");
	}
}
