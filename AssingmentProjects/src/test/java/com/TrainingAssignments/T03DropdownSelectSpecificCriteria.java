package com.TrainingAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class T03DropdownSelectSpecificCriteria {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");

		// Initialize WebDriver
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		//Launching URL
	        driver.get("https://demoqa.com/select-menu");

		//Selecting the dropdown element by locating its id
			Select select = new Select(driver.findElement(By.id("oldSelectMenu")));

        //Printing the options of the dropdown
        //Get list of web elements
			List<WebElement> lst = select.getOptions();

        //Looping through the options and printing dropdown options
			System.out.println("The dropdown options are:");
				for(WebElement options: lst)
						System.out.println(options.getText());

        //Selecting the option as 'Purple'-- selectByIndex
				System.out.println("Select the Option by Index 4");
				select.selectByIndex(4);
				System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Selecting the option as 'Magenta'-- selectByVisibleText
				System.out.println("Select the Option by Text Magenta");
				select.selectByVisibleText("Magenta");
				System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

        //Selecting an option by its value
				System.out.println("Select the Option by value 6");
				select.selectByValue("6");
				System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

				driver.close();
		}
	}
