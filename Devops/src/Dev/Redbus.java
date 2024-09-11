package Dev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		
// Removed show notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

//Launching browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String baseUrl = "https://www.redbus.in/";
		driver.get(baseUrl);

//From
		driver.findElement(By.id("src")).sendKeys("chen");
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();

// To
		driver.findElement(By.id("dest")).sendKeys("bang");
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/ul/li[1]/div/text")).click();

//Search Button
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]")).click();

//Search button
		driver.findElement(By.id("search_button")).click();
		
		//driver.close();

	}

}
