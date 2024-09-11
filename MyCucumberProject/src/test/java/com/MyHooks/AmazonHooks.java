package com.MyHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.StepDef.S06AmazonSearch;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {
	//@Before
	public void start()
	{
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Welcome\\Driver\\chromedriver.exe");
		S06AmazonSearch.driver = new ChromeDriver();
		S06AmazonSearch.driver.manage().window().maximize();
		S06AmazonSearch.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	//@After
	public void end()
	{
		System.out.println("After");
		S06AmazonSearch.driver.close();
	}

}