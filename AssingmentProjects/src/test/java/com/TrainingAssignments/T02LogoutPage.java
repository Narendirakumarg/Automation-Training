package com.TrainingAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class T02LogoutPage {
	WebDriver driver;

	public T02LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators for the elements related to logout
	By userDropdown = By.xpath("//p[@class='oxd-userdropdown-name']");
	By logoutLink = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a");

	// Method to click on the user dropdown
	public void clickUserDropdown() {
		driver.findElement(userDropdown).click();
	}

	// Method to click on the logout link
	public void clickLogoutLink() {
		driver.findElement(logoutLink).click();
	}

	// Method to perform the logout action
	public void logout() {
		clickUserDropdown();
		clickLogoutLink();
	}

}