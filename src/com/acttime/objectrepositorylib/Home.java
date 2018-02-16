package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='Tasks']/..")
	WebElement taskImg;
	
	@FindBy(xpath="//div[text()='Users']")
	WebElement userImg;
	
	public void naviagteToTaskPage(){
		taskImg.click();
	}
	public void naviagteToUSerPage(){
		userImg.click();
	}

}
