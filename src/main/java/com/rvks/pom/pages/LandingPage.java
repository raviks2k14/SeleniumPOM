package com.rvks.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rvks.pom.base.TestBase;

public class LandingPage extends TestBase {

	//Page Object Repository
	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
	WebElement signUpLink;
	
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']/span[2][contains(text(), 'Log In')]")
	WebElement loginLink;
	
	public LandingPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean validateSignUpLink(){
		return signUpLink.isDisplayed();
	}
	
	public boolean validateLoginLink(){
		return loginLink.isDisplayed();
	}
	
	public LoginPage clickLoginLink(){
		loginLink.click();
		return new LoginPage();
	}
}
