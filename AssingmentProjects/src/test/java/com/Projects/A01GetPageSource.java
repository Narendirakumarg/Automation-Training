package com.Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01GetPageSource {

	public static void main(String[] args) {
		System.out.println("Hellow");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		
		
		// Using GetPageSource() Method
		
//		String b = driver.getPageSource();
//		System.out.println("Hellow: ", + b);
		
		WebElement Name = driver.findElement(By.name("body"));
		String p = Name.getText();
	    System.out.println("Page Source is : " + p);
		
		driver.close();
		
		

	}

}
