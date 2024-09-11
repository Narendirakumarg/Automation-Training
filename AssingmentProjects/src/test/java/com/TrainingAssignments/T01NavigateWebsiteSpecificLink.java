package com.TrainingAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write a WebDriver script to navigate to a website and click on a specific link.

public class T01NavigateWebsiteSpecificLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");

		List<WebElement> Googleofferedin = driver.findElements(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div"));

		for (WebElement m : Googleofferedin) {
			System.out.println("Example Wesite Links : " + m.getText());
		}

		Thread.sleep(1000);
		WebElement Gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
		Gmail.click();

		System.out.println("After Clicked specific link :" + driver.getCurrentUrl());

		driver.close();		
	}

}
