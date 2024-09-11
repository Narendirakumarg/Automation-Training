package Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "https://echoecho.com/htmlforms09.htm";
		driver.get(baseUrl);
		
		
		
		

	}

}
