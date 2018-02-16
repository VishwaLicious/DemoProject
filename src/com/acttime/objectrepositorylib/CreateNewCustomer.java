package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {

	@FindBy(name="name")
	WebElement customerNameEdt;
	
	@FindBy(xpath="//input[@value='Create Customer']")
	WebElement creteCustomerBtn;
	
	@FindBy(name="description")
	WebElement desEdt;
	
	public void createCustomer(String customerName){
		customerNameEdt.sendKeys(customerName);
		creteCustomerBtn.click();
	}
	public void createCustomer(String customerName ,String des){
		customerNameEdt.sendKeys(customerName);
		desEdt.sendKeys(des);
		creteCustomerBtn.click();
	}
	
}

