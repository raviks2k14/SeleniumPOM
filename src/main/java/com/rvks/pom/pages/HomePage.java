package com.rvks.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rvks.pom.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@id='main-nav']/a[@href='/contacts']/span")
	WebElement contactLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateContactsLink() {
		return (contactLink.isDisplayed());
	}

	public ContactsPage clickContactsLink() {
		contactLink.click();
		return new ContactsPage();
	}

}
