package com.acttime.customettest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.genericlib.ExcelLib;
import com.acttime.objectrepositorylib.CreateNewCustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.OpenTask;
import com.acttime.objectrepositorylib.ProjectAndCustomer;



public class CstomerTest extends BaseClass{

	ExcelLib eLib = new ExcelLib();
	
	
	@Test
	public void createCustomerTest() throws Throwable{
		//read data from Excel
		String customerNAme = eLib.getExcelData("Sheet1", 1, 2);
		
	   //step 2 : navigate to Task Page
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.naviagteToTaskPage();
	  //step 3 : click on "PRoject & Customer " link
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.naviagateToProjAndCustPAge();
	  //step 4 : click on "Create new Customer" btn
		ProjectAndCustomer pc = PageFactory.initElements(driver, ProjectAndCustomer.class);
		pc.naviagetToCreateNewCustomerPage();
	//step 5 : create new Customer
		CreateNewCustomer cp = PageFactory.initElements(driver, CreateNewCustomer.class);
		cp.createCustomer(customerNAme);
	}

}



