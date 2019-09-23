package com.rvks.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rvks.pom.base.TestBase;
import com.rvks.pom.pages.HomePage;
import com.rvks.pom.pages.LandingPage;
import com.rvks.pom.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		landingPage = new LandingPage();
		loginPage = landingPage.clickLoginLink();
	}
	
	@Test(priority=1)
	public void validateEmailTxtBoxTest(){
		Assert.assertTrue(loginPage.validateEmailTxtBox());
	}
	
	@Test(priority=2)
	public void validatePasswordTxtBoxTest(){
		Assert.assertTrue(loginPage.validatePasswordTxtBox());
	}
	
	@Test(priority=3)
	public void loginCRMTest(){
		homePage = loginPage.loginCRM(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
