package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			String baseUrl = "https://www.google.com";
			driver.get(baseUrl);
			
			WebElement emailId = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
			emailId.sendKeys("test@gmail.com");
			WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][name=\"pass\"]"));
			password.sendKeys("12345");
			WebElement loginBtn = driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]"));
			//loginBtn.click();
			//loginBtn.sendKeys(Keys.ENTER);
			loginBtn.submit();

	}

}
