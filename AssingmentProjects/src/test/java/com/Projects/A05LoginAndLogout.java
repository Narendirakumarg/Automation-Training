package com.Projects;

//Try login and logout on https://practicetestautomation.com/practice-test-login/

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A05LoginAndLogout {
	WebDriver driver;
	String actUrl = "https://practicetestautomation.com/practice-test-login/";

// 4th executing	
	@Test(priority = 1)
	public void login() {
		System.out.println("Entered US & PS - 4th executing");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

	}

	@Test(priority = 2)
	public void success() {
		System.out.println("Verify URL - 4th executing");
		Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong")).getText());
	}

	@Test (priority = 3)
	public void menu()
	{
		System.out.println("Reading Menus - 4th executing");
		List<WebElement> menus = driver.findElements(By.xpath("/html/body/div/div/header/div[3]/div[1]/div/div[2]/div/nav/ul/li"));

		for (WebElement m : menus) {
			System.out.println(m.getText());
		}
		
	}

	@Test(priority = 4)
	public void logout() {
		System.out.println("Logout - 4th executing");
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}


// 2nd executing
	@BeforeClass
	public void beforeClass() {
		System.out.println("Getting Title - 2nd executing");
		driver.get(actUrl);
		System.out.println("Title : " + driver.getTitle());
	}


// 1st executing
	@BeforeTest
	public void beforeTest() {
		System.out.println("Lanuching Browser - 1st executing");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

// 7th executing
	@AfterTest
	public void afterTest() {
		System.out.println("Driver Closed - 7th executing");
		driver.close();
	}

}
