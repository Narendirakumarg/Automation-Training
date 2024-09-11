package com.TrainingAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T04ValidateFunctionalityRegistrationFrom {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// set the location of chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");

		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Step 1: Navigate to the registration page
		driver.get("https://mytestingthoughts.com/Sample/home.html");

		// Step 2: Fill out the registration form
		//driver.findElement(By.id("//div[1]//fieldset[1]//div[11]//div[1]//a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("narendira");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("kumar");
				
		// Step 3: Check the terms and conditions checkbox
		WebElement termsCheckbox = driver.findElement(By.xpath("//*[@id=\"inlineRadioMale\"]"));
		if (!termsCheckbox.isSelected()) {
			termsCheckbox.click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect2\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/select")).click();
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/select/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("narendirakumar");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/input")).sendKeys("asdf@123");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("asdf@1232");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")).sendKeys("asdf@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div/input")).sendKeys("044)45679856");
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")).sendKeys("Hellow");
				
		// Step 4: Submit the form
		driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).submit();

		// Step 5: Verify that the form was successfully submitted  = Success  Success!.
		WebElement success = driver.findElement(By.xpath("//*[@id=\"success_message\"]"));
		if (success.isDisplayed()) {
			System.out.println("Activation: " + success.getText());
		} else {
			System.out.println("success failed or success message not found.");
		}

		// Close the browser
		driver.quit();

	}
}