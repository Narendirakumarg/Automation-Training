package com.MyAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05BlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dash.bling-center.com/platform/signIn.html");
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[5]/button/p")).click();
		driver.findElement(By.id("email1")).sendKeys("ankush@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Application Says: " + driver.findElement(By.id("resetsuccess")).getText());
		
		driver.close();
	}

}
