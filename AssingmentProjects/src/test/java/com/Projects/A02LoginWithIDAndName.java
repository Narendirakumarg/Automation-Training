package com.Projects;

//Open https://www.echotrak.com/Login.aspx?ReturnUrl=%2f and try to login with id, name

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A02LoginWithIDAndName {
	public WebDriver driver;
	String url = "https://www.echotrak.com/Login.aspx?ReturnUrl=%2f";

// 3rd executing
	@Test(priority = 1)
	public void username() {
		// System.out.println("Test 1");
		//driver.findElement(By.name("txtCustomerID")).sendKeys("admin");
		//driver.findElement(By.id("txtCustomerID")).sendKeys("admin");
		//driver.findElement(By.xpath("//*[@id=\"txtCustomerID\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
		
	}

	@Test(priority = 2)
	public void password() {
		// System.out.println("Test 2");
		//driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
	}

	@Test(priority = 3)
	public void submit() {
		System.out.println("Test 3");
		//driver.findElement(By.name("Butsub")).submit();
		//driver.findElement(By.id("Butsub")).submit();
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).submit();
		
	}
	
// 2nd executing
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		// System.out.println("02 - beforeMethod");
		driver.get(url);
		System.out.println("Title: " + driver.getTitle());

	}

//4th executing
	@AfterMethod(alwaysRun = true)
	public void afterMethod() throws IOException {
		// System.out.println("02 - afterMethod");
		int i = 1;
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("Image" + i + ".jpg"));
		i++;

	}

// 1st executing

	@BeforeTest
	public void beforeTest() throws Exception {
		System.out.println("01 Lanuching Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

//5th executing
	@AfterTest
	public void afterTest() throws InterruptedException {
		System.out.println("05 Driver Closed");
		Thread.sleep(3000);
		driver.close();
	}

}
