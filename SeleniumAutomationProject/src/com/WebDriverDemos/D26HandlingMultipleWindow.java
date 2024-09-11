package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class D26HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://online.citibank.co.in/");

		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup3\"]/div/a")).click();

		driver.findElement(By.xpath("//span[@style=\"display:table-cell\"]")).click();
				
		System.out.println("Ttile : " +driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> itr = windows.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		System.out.println("Ttile : " +driver.getTitle());
		driver.findElement(By.linkText("Continue")).click();
		
		driver.switchTo().window(win1);
		Thread.sleep(3000);
		driver.switchTo().window(win2);
		Thread.sleep(3000);
		driver.switchTo().window(win1);
		Thread.sleep(3000);
		
		driver.quit();
		
		// https://online.citibank.co.in/card-offers/rbiorg-disclaimer.htm

	}

}
