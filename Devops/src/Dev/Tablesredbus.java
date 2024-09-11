package Dev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tablesredbus {

	public static void main(String[] args) {
		// Removed show notification
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		// Launching browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		String baseUrl = "https://www.rediff.com/";
		driver.get(baseUrl);

			driver.findElement(By.linkText("money")).click();
			driver.findElement(By.partialLinkText("more")).click();
		
		
	}

}
