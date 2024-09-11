package com.TrainingAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class T02LoginTest {

	static WebDriver driver;
	static String actUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException

	{
		// Set the path to your ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");

		// Initialize the WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		try {
			// Navigate to the login page
			driver.get(actUrl);

			// Create an instance of the LoginPage
			T02LoginPage loginPage = new T02LoginPage(driver);

			// Perform the login action
			loginPage.login("your-username", "your-password");

			Thread.sleep(3000);

			actUrl = driver.getCurrentUrl();
			Assert.assertTrue(actUrl.contains("dashboard"), "Invalid credentials");

			System.out.println("Title :" + driver.getTitle());
			System.out.println("Current URL :" + driver.getCurrentUrl());

			Thread.sleep(3000);

			// Navigate to the logout page

			T02LogoutPage logoutpage = new T02LogoutPage(driver);
			logoutpage.logout();

			// Optionally, add assertions or other test logic here
		} finally {
			// Close the browser
			driver.quit();
		}
	}

}