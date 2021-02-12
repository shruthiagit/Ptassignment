package com.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.runner.BaseClass;

public class Action extends BaseClass{

	public void clickOnElement(By element) {
		
		driver.findElement(element).click();
		
	}
	public void updateTextBox(By element, String value) {
		
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);
		
	
	}
	
	public void Enter(By element) {
		driver.findElement(element).sendKeys(Keys.ENTER);
	}
}
