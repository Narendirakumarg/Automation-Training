package Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicidname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		//WebElement searchBox = driver.findElement(By.className("gLFyf"));
				//searchBox.sendKeys("pagalworld");
				//searchBox.sendKeys(Keys.RETURN);		//Hit enter
				//searchBox.sendKeys(Keys.CONTROL + "A");
				
				//WebElement searchBtn = driver.findElement(By.name("btnK"));
				//searchBtn.click();
				driver.findElement(By.className("gLFyf")).sendKeys("Ankush Vankore");
				driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);

	}

}
