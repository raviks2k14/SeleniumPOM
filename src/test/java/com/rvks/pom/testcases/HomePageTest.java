package com.rvks.pom.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rvks.pom.base.TestBase;
import com.rvks.pom.pages.ContactsPage;
import com.rvks.pom.pages.HomePage;
import com.rvks.pom.pages.LandingPage;
import com.rvks.pom.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		landingPage = new LandingPage();
		loginPage = landingPage.clickLoginLink();
		homePage = loginPage.loginCRM(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void validateContactsLinkTest(){
		Assert.assertTrue(homePage.validateContactsLink());
	}
	
	@Test(priority=2)
	public void clickContactsLinkTest(){
		contactsPage = homePage.clickContactsLink();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
