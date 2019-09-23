package com.rvks.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rvks.pom.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "email")
	WebElement emailTxtBox;

	@FindBy(name = "password")
	WebElement passwordTxtBox;

	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[3]")
	WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateEmailTxtBox() {
		return emailTxtBox.isDisplayed();
	}

	public boolean validatePasswordTxtBox() {
		return passwordTxtBox.isDisplayed();
	}

	public HomePage loginCRM(String un, String pwd) {
		emailTxtBox.sendKeys(un);
		passwordTxtBox.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}

}
