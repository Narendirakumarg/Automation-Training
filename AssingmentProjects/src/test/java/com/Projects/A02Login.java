package com.Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02Login {
	
	public static void main(String[] args) {


			System.out.println("01 Lanuching Browser");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
			
			driver.findElement(By.name("txtCustomerID")).sendKeys("admin");
			
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
			
			driver.findElement(By.id("Butsub")).submit();
	
			//driver.close();

	}

}

