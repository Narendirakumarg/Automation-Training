package Dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrelativeabsolute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		String baseUrl = "https://www.echotrak.com/Login.aspx?ReturnUrl=%2f";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"txtCustomerID\"]")).sendKeys("sdsf");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("dfdf");
		driver.findElement(By.xpath("//*[@id=\"Butsub\"]")).click();
		
		WebElement Error = driver.findElement(By.xpath("//*[@id=\"lblMsg\"]"));
		System.out.println(Error.getText());
		driver.close();

				
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input")).sendKeys("raisha");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[2]/fieldset/input[2]")).sendKeys("raisha123");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div[2]/div/div/div/div/form/fieldset/div[3]/div/input")).click();
	}

}
