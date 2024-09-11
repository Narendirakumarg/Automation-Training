package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04RediffRegister {
	WebDriver driver;
	
	@Given("Open rediff registration page")
	public void open_rediff_registration_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("I enter fullName as {string}")
	public void i_enter_full_name_as(String fullName) {
	    driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]")).sendKeys(fullName);
	}

	@When("I enter choose redif id as {string}")
	public void i_enter_choose_redif_id_as(String rediffId) {
	    driver.findElement(By.cssSelector("input[name^=\"login\"]")).sendKeys(rediffId);
	}

	@When("I Click on check availablity")
	public void i_click_on_check_availablity() throws InterruptedException {
	    driver.findElement(By.cssSelector("input[name^=\"btnchkav\"]")).click();
	    Thread.sleep(5000);
	    String msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText();
	    //Assert.assertTrue(msg.contains("Yippie"));
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText());
	    
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
	    driver.findElement(By.cssSelector("input[name^=\"passwd\"]")).sendKeys(password);
	}

	@When("I enter confirm password {string}")
	public void i_enter_confirm_password(String confirm) {
	    driver.findElement(By.cssSelector("input[name^=\"confirm_pass\"]")).sendKeys(confirm);
	}

	@When("I enter alt mail id {string}")
	public void i_enter_alt_mail_id(String altMail) {
	    driver.findElement(By.cssSelector("input[name^=\"altemail\"]")).sendKeys(altMail);
	    
	}
	
	@When("I enter mobile no as {int}")
	public void i_enter_mobile_no_as(Integer mNo) {
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys(mNo.toString());
	}

	@When("enter fullName as {string}")
	public void enter_full_name_as(String fullName) {
	    driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[3]/td[3]/input[1]")).sendKeys(fullName);
	}

	@When("enter choose redif id as {string}")
	public void enter_choose_redif_id_as(String rediffId) {
	    driver.findElement(By.cssSelector("input[name^=\"login\"]")).sendKeys(rediffId);
	}

	@When("Click on check availablity")
	public void click_on_check_availablity() throws InterruptedException {
		driver.findElement(By.cssSelector("input[name^=\"btnchkav\"]")).click();
		Thread.sleep(5000);
	    //System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText());
		String msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText();
	    Assert.assertTrue(msg.contains("Yippie"));
	}

	@When("enter password as {string}")
	public void enter_password_as(String password) {
	    driver.findElement(By.cssSelector("input[name^=\"passwd\"]")).sendKeys(password);
	}

	@When("enter confirm password as {string}")
	public void enter_confirm_password_as(String confirm) {
	    driver.findElement(By.cssSelector("input[name^=\"confirm_pass\"]")).sendKeys(confirm);
	}

	@When("enter alt mail id {string}")
	public void enter_alt_mail_id(String altMail) {
	    driver.findElement(By.cssSelector("input[name^=\"altemail\"]")).sendKeys(altMail);
	}
	
	@When("enter mobile no as {int}")
	public void enter_mobile_no_as(Integer mNo) {
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys(mNo.toString());
	}

}