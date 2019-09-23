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

public class ContactsPageTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		landingPage = new LandingPage();
		loginPage = landingPage.clickLoginLink();
		homePage = loginPage.loginCRM(prop.getProperty("username"), prop.getProperty("password"));
		contactsPage = homePage.clickContactsLink();
	}
	
	@Test(priority=1)
	public void validateNewContactsLinkTest(){
		Assert.assertTrue(contactsPage.validateNewContactsLink());
	}
	
	@Test(priority=2)
	public void clickNewContactsLinkTest(){
		contactsPage.clickNewContacts();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
