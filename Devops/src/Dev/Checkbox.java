package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "http://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(baseUrl);

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		
		System.out.println("=========Checked Box=========");
		
		System.out.println("Before Clicking");
		System.out.println("Before Clicking: " +checkbox.isSelected());
		System.out.println("Before Clicking: " +checkbox.isEnabled());
		System.out.println("Before Clicking: " +checkbox.isDisplayed());
		
		if(checkbox.isSelected() == false)
		checkbox.click();
		else
			System.out.println("check is already selected");
		
		System.out.println("After Clicking");
		System.out.println("After Clicking: " +checkbox.isSelected());
		System.out.println("After Clicking: " +checkbox.isEnabled());
		System.out.println("After Clicking: " +checkbox.isDisplayed());
		
		System.out.println("=========Radio Button=========");
		
		
		
	}

}
