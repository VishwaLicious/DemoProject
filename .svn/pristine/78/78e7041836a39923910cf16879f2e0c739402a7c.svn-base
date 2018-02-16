package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(name="username")
	WebElement usernameEdt;
	
	@FindBy(name="pwd")
	WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	 WebElement loginBtn;
	
	
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void login(String userName, String password){
		usernameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
	

}
