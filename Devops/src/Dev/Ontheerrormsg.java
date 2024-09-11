package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ontheerrormsg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		String baseUrl = "https://www.facebook.com";
		driver.get(baseUrl);
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		username.sendKeys("killernaree@gmail.com");
		password.sendKeys("kkillerr1");
		WebElement login = driver.findElement(By.name("login")); 
		login.click();
		
		WebElement Error = driver.findElement(By.className("_9ay7"));
		String ror = Error.getText();
		System.out.println("Error : " + ror);
		driver.close();
				
		//Thread.sleep(5000);

	}

}
