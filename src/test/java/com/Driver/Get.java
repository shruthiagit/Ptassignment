package com.Driver;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Get extends BaseClass{
	
	public String getElementText(By element) {
		
		return driver.findElement(element).getText();
	}
}
	
