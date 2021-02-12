package com.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClass;

public class UserWait extends BaseClass{
	
	public void waitclickOnElement(By element) {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	
		
	}
	
	public void explicitWait(int timeinmilli) throws InterruptedException {
		
		Thread.sleep(timeinmilli);
	}
	


}
