package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("Launch Google")
	public void launch_google() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
	}

	@When("I enter valid keyword in search box")
	public void i_enter_valid_keyword_in_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Bigboss Marathi");
	}

	@When("I hit Enter")
	public void i_hit_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("A valid search should display")
	public void a_valid_search_should_display() {
	    Assert.assertTrue(driver.getTitle().contains("Bigboss"));
	}

}