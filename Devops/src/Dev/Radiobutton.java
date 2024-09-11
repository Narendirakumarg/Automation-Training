package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "http://register.rediff.com/register/register.php?FormName=user_details";
		driver.get(baseUrl);

		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		System.out.println("Before Selecting Radio button");
		System.out.println("Before selecting : " +radiobutton.isSelected());
		
		if(radiobutton.isSelected() == false)
		radiobutton.click();
		
		System.out.println("After Selected Radio button");
		System.out.println("After Selected: " + radiobutton.isSelected());
		
	
	}

}
