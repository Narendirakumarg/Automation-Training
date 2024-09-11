package Dev;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blingassignment {

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
		String baseUrl = "https://dash.bling-center.com/platform/signIn.html";
		driver.get(baseUrl);

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[5]/button/p")).click();
		driver.findElement(By.id("email1")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[2]/button[2]/p")).click();
		
		System.out.println("Hellow : " + driver.findElement(By.xpath("//*[@id=\"resetsuccess\"]")).getText());
	}

}
