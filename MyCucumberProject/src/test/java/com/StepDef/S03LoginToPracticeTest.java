package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ForPOM.PracticeTest;

import io.cucumber.java.en.*;

public class S03LoginToPracticeTest {
	WebDriver driver;
	PracticeTest t1;
	
	@Given("Practice Test Automation page in browser")
	public void practice_test_automation_page_in_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	    t1 = new PracticeTest(driver);
	    
	    System.out.println("practice_test_automation_page_in_browser");
	}
	
	@Given("Open Practice Test Automation page")
	public void open_practice_test_automation_page() {
		System.out.println("open_practice_test_automation_page");
	}

	@When("I enter valid user name")
	public void i_enter_valid_user_name() {
	    //driver.findElement(By.id("username")).sendKeys("student");
		t1.enterUserName("student");
	}

	@When("I enter valid password")
	public void i_enter_valid_password() {
	    //driver.findElement(By.id("password")).sendKeys("Password123");
		t1.enterPassword("Password123");
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
	    driver.findElement(By.id("submit")).click();
	}

	@Then("Login should successful")
	public void login_should_successful() {
	    //System.out.println(driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText());
		String msg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText();
		System.out.println(msg);
		
		Assert.assertTrue(msg.contains("Successfully"));
	}

	@Given("I Open Practice test automation")
	public void i_open_practice_test_automation() {
		System.out.println("i_open_practice_test_automation");
	}

	@When("I Enter invalid user name")
	public void i_enter_invalid_user_name() {
		driver.findElement(By.id("username")).sendKeys("shradha");
	}

	@When("I Enter invalid password")
	public void i_enter_invalid_password() {
		driver.findElement(By.id("password")).sendKeys("shradha123");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
	    String msg = driver.findElement(By.id("error")).getText();
	    System.out.println("Error Message: " + msg);
	    Assert.assertTrue(msg.contains("invalid"));
	}
}