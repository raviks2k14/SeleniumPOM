package com.rvks.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rvks.pom.base.TestBase;

public class ContactsPage extends TestBase{

	@FindBy(xpath = "//*[@class='item']/a[@href='/contacts/new']/button")
	WebElement newContactBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public boolean validateNewContactsLink() {
		return (newContactBtn.isDisplayed());
	}

	public void clickNewContacts() {
		newContactBtn.click();
	}
	
}
