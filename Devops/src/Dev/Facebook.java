package Dev;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException 
	{
		{
		//  System.out.println("djfjfdjfg");
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
			//Thread.sleep(9000);
			//driver.manage().window().minimize();
			//driver.manage().window().maximize();
			//driver.manage().window().fullscreen();
			
			Thread.sleep(5000);
			
//			Alert alert = driver.switchTo().alert();
//			String alertmessage = driver.switchTo().alert().getText();
//			System.out.println("alertmessage");
//			
//			
//			WebElement enter = driver.findElement(By.xpath("//*[@id=\"mount_0_0_M8\"]/div/div[1]/div/div[2]/div[3]/div/div/div/div/div/label/input"));
//			enter.sendKeys("Saramya G");
//			enter.submit();
//			Thread.sleep(8000);
//			driver.close();
			
			// Getting Title 
			
			String title = driver.getTitle();
			System.out.println("Title: " +title);
			
			if(title.equals("Facebook"))
				System.out.println("Crrect");
			else
				System.out.println("Fail");
			
		}
	}
}