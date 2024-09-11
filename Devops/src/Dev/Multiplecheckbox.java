package Dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "https://demoqa.com/select-menu";
		driver.get(baseUrl);
		
		
		
		List<WebElement>product = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		
		for(WebElement p : product)
		{
		System.out.println("\nBefore Clicking");
		System.out.println(p.getAttribute("value") +": Before Clicking: " +p.isSelected());
		System.out.println(p.getAttribute("value") +": Before Clicking: " +p.isEnabled());
		System.out.println(p.getAttribute("value") +": Before Clicking: " +p.isDisplayed());
		
		if(!p.isSelected())
		p.click();
		else
			System.out.println("check is already selected");
		
		System.out.println(p.getAttribute("value") +": After Clicking");
		System.out.println(p.getAttribute("value") +": After Clicking: " +p.isSelected());
		System.out.println(p.getAttribute("value") +": After Clicking: " +p.isEnabled());
		System.out.println(p.getAttribute("value") +": After Clicking: " +p.isDisplayed());
		}
	}

}
