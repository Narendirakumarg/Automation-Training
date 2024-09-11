package com.TrainingAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T02LoginPage {
	WebDriver driver;

	// Constructor to initialize the WebDriver
	public T02LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for the elements on the login page
	By usernameField = By.xpath("//input[@placeholder='Username']");
	By passwordField = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[normalize-space()='Login']");

	// Method to enter the username
	public void enterUsername(String username) {
		WebElement usernameElement = driver.findElement(usernameField);
		usernameElement.clear();
		usernameElement.sendKeys("Admin");
	}

	// Method to enter the password
	public void enterPassword(String password) {
		WebElement passwordElement = driver.findElement(passwordField);
		passwordElement.clear();
		passwordElement.sendKeys("admin123");
	}

	// Method to click on the login button
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	// Method to perform the login action
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();

	}

}
