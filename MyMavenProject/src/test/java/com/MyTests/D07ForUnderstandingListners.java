package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyTests.Listners_D07ForUnderstandingListners.class)
public class D07ForUnderstandingListners {
  @Test
  public void passTest() {
	  Assert.assertTrue(true);
  }
  @Test
  public void failTest() {
	  Assert.assertTrue(false);
  }
  @Test
  public void skipTest() {
	  throw new SkipException("Skipping this test");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

}