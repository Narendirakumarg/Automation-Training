package samsar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("djfjfdjfg");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://support.saucelabs.com/s/?language=en_US";
		driver.get(baseUrl);
	}

}