package Dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("TOTAL Links : " + links.size());
		links.get(0);
		driver.close();
		

	}

}
