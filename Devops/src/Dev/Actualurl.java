package Dev;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Actualurl 
{

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException 
	{
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			String baseUrl = "https://www.facebook.com";
			driver.get(baseUrl);
			WebElement username = driver.findElement(By.name("email"));
			WebElement password = driver.findElement(By.name("pass"));
			username.sendKeys("killernaree@gmail.com");
			password.sendKeys("kkillerr");
			WebElement login = driver.findElement(By.name("login")); 
			
			login.click();
			Thread.sleep(5000);
			
			

			String url = driver.getCurrentUrl();
			System.out.println("URL" +url);
			
						
			driver.close();
		}
	}
}

//getPageSource - Assignment 