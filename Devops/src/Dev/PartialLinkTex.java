package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		String baseUrl = "https://www.google.com/";
		driver.get(baseUrl);
		
		//WebElement adLink = driver.findElement(By.partialLinkText("ertis"));
				//adLink.click();
				driver.findElement(By.partialLinkText("Ad")).click();
				
				
				//String name = "Ankush";
				//System.out.println("Ankush");

	}

}
