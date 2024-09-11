package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S01GoogleTitle {
	WebDriver driver;
	String title;
	@Given("Open Google")
	public void open_google() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
	}

	@When("Read the title")
	public void read_the_title() {
	    title = driver.getTitle();
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		System.out.println("Title: " + title);
		if(title.equals("Google"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}
}