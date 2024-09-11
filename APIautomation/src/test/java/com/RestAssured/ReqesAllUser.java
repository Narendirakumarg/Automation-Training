package com.RestAssured;

import org.testng.annotations.Test;

import com.Utility.Library;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class ReqesAllUser extends Library {
	
  @Test
  public void ValidateReqesIndUser() {
	  System.out.println("ValidateReqesIndUser");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  try {
		ReadPropertiesFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside After Method");	  
  }

}
