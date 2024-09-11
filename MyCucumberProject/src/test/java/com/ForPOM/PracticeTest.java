package com.ForPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeTest {
	@FindBy (id = "username") WebElement userName;
	@FindBy (id = "password") WebElement password;
	WebDriver driver;

	public PracticeTest(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String un)
	{
		//driver.findElement(By.id("username")).sendKeys(un);
		userName.sendKeys(un);
	}
	public void enterPassword(String ps)
	{
		password.sendKeys(ps);
	}
	

}