package Dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		String baseUrl = "https://www.google.co.in/";
		driver.get(baseUrl);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: " + links.size());

		// System.out.println(links.get(0).getText());
		// System.out.println(links.get(1).getText());

		// for(int i = 0; i < links.size(); i++)
		// System.out.println(links.get(i).getText());

		for (WebElement l : links)
			System.out.println(l.getText());

		driver.close();

	}

}
