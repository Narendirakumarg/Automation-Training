package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05GoogleLinks {
	WebDriver driver;
	@Given("I Open Google Application")
	public void i_open_google_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in");
		//driver.close();
	}

	@When("I Click on Gmail Link")
	public void i_click_on_gmail_link() {
	    driver.findElement(By.partialLinkText("Gmail")).click();
	}

	@Then("Gmail page should displayed")
	public void gmail_page_should_displayed() {
	    System.out.println(driver.getTitle());
	    Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}

	@When("I Click on Images Link")
	public void i_click_on_images_link() {
		driver.findElement(By.partialLinkText("Images")).click();
	}

	@Then("Images page should displayed")
	public void images_page_should_displayed() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Images"));
	}

	@When("I Click on Store link")
	public void i_click_on_store_link() {
		driver.findElement(By.partialLinkText("Store")).click();
	}

	@Then("Store page should displayed")
	public void store_page_should_displayed() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Store"));
	}

	@When("I Click on Terms Link")
	public void i_click_on_terms_link() {
		driver.findElement(By.partialLinkText("Terms")).click();
	}

	@Then("Terms page should displayed")
	public void terms_page_should_displayed() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Terms"));
	}
	

}