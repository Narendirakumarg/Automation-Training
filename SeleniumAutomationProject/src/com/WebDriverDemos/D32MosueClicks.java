package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32MosueClicks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement dblClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		//act.moveToElement(dblClick).doubleClick().perform();
		act.doubleClick(dblClick).perform();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li/span"));
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		WebElement editMenu = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		//editMenu.click();
		act.moveToElement(editMenu).click().perform();
	}

}
