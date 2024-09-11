package Dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "http://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(baseUrl);

		WebElement Dropdown = driver.findElement(By.id("country"));
		Select drdo = new Select(Dropdown);

		System.out.println("Select Couyrt" + drdo.getFirstSelectedOption().getTagName());

		List<WebElement> CountryList = drdo.getOptions();
		System.out.println("ghfdhydh vhgh" + CountryList.size());

		// drdo.selectByVisibleText("congo");
		// drdo.selectByIndex(2);
		// drdo.selectByValue("Aruba");

		for (int i = 0; i < CountryList.size(); i++) {
			System.out.println(CountryList.get(i).getText());
		}
		drdo.selectByVisibleText("United Kigdom");
		System.out.println("Selected Country :" + drdo.getFirstSelectedOption().getText());

	}

}
