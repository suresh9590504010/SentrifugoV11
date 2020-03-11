package com.sentrifugo.myInfo.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement setUserName;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement setPassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement clickLoginButton;
	
	@FindBy(id="welcome")
	@CacheLookup
	WebElement selectLogout;
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement clickLogout;
	
	
	public void setUserName(String uname) {
		setUserName.clear();
		setUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		setPassword.clear();
		setPassword.sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		clickLoginButton.click();

	}
	
	public void selectLogout() {
		selectLogout.click();

	}
	
	public void clickLogout() {
		clickLogout.click();

	}
	
	
}
