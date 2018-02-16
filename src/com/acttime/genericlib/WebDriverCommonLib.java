package com.acttime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
	
	public void select(WebElement selWb ,String text){
		Select sel = new Select(selWb);
		sel.selectByVisibleText(text);
	}
	public void moveMouseToElement(WebElement element){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	
	public void waitForPageToLoad(){
		BaseClass.driver.manage().timeouts().
		               implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void waitForElementPresent(WebElement element){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}




