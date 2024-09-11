package Dev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readtitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String baseUrl = "https://www.selenium.dev/";
		driver.get(baseUrl);
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("Selenium"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		
		driver.close();

	}

}
