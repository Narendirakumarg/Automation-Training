package Dev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		String baseUrl = "https://demoqa.com/select-menu";
		driver.get(baseUrl);

		WebElement listBox = driver.findElement(By.id("cars"));
		Select cars = new Select(listBox);

		System.out.println("List of all the cars");
		List<WebElement> carList = cars.getOptions();
		for (WebElement c : carList)
			System.out.println(c.getText());

		if (cars.isMultiple()) {
			cars.selectByIndex(1);
			cars.selectByIndex(2);

			List<WebElement> selectedCars = cars.getAllSelectedOptions();

			System.out.println("\nSelected cars: ");
			for (WebElement sc : selectedCars)
				System.out.println(sc.getText());
		}

		cars.deselectByIndex(2);
		cars.deselectAll();

	}

}
