package com.rvks.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rvks.pom.base.TestBase;
import com.rvks.pom.pages.LandingPage;

public class LandingPageTest extends TestBase{
	
	LandingPage landingPage;

	public LandingPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		landingPage = new LandingPage();
	}
	
	@Test(priority=1)
	public void testSignUpLink(){
		Assert.assertTrue(landingPage.validateSignUpLink());
	}
	
	@Test(priority=2)
	public void testLoginLink(){
		Assert.assertTrue(landingPage.validateLoginLink());
	}
	
	@Test(priority=3)
	public void clickLoginLink(){
		landingPage.clickLoginLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
