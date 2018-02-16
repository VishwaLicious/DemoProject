package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acttime.objectrepositorylib.Common;
import com.acttime.objectrepositorylib.Login;


public class BaseClass {
	
	ExcelLib elib = new ExcelLib();
	public static WebDriver driver;
	
	
		@BeforeClass
		public void configBc() throws Throwable{
		
			System.out.println("==launch browser=");		
	        driver = new FirefoxDriver();	
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get(CommonData.url);
		}
		@BeforeMethod
		public void configBm() throws Throwable{
			//read common data
			
			System.out.println("login to app");
			Login lp = PageFactory.initElements(driver, Login.class);
			lp.login(CommonData.username, CommonData.password);
		}
		
		@AfterMethod
		public void configAm(){
			System.out.println("logout to APP");
		    Common cp = PageFactory.initElements(driver, Common.class);
		    cp.logout();
		}					 		 
		@AfterClass
		public void configAc(){
			System.out.println("===close browser==");
			driver.close();
		}

}
