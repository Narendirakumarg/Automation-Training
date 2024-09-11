package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06AmazonSearch {
	public static WebDriver driver;
	@Given("Open url {string}")
	public void open_url(String url) {
		driver.get(url);
	}

	@When("I search for {string}")
	public void i_search_for(String product) {
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);;
	    driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("Product should displayed")
	public void product_should_displayed() {
	    System.out.println(driver.getTitle());
	}
}