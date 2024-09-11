package com.MyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchotrakLogin_ClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		driver.findElement(By.className("form-control")).sendKeys("mythili");
		driver.findElement(By.id("txtPassword")).sendKeys("mythili123");
		driver.findElement(By.id("Butsub")).click();
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg = errMsg.getText();
		
		System.out.println("Error Message: " + msg);
		
		if(msg.equals("Invalid Username/Password"))
			System.out.println("Correct Error Message: Test case Pass");
		else
			System.out.println("Wrong Error Message: Test case FAIL!!!");
		
		driver.close();
	}

}
