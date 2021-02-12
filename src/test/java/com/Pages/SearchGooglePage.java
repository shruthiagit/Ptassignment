package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.Driver.UserWait;
import com.runner.BaseClass;

public class SearchGooglePage extends BaseClass {

	// put elements belonging to home page here
	public static By SEARCHBOX = By.cssSelector("input[title='Search']");
	public static By PLAYTECHRESULT = By.xpath("//a[@href = 'https://www.playtech.com/']");
	public static By SELECTDROPDAY = By.cssSelector("[name=day]");
	public static By SELECTDROPMONTH = By.cssSelector("[name=month]");
	public static By SELECTDROPYEAR = By.cssSelector("[name=year]");
	public static By SUBMITAGE = By.cssSelector(".submit");

	public void verifySearchGooglePage() {

		driver.get("https://www.google.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='I agree']")).click();
		Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());

	}

	public void searchPlaytech() {

		action.updateTextBox(SEARCHBOX, "Playtech.com");
		action.Enter(SEARCHBOX);

	}

	public void playtechSearchResults() {
		
		action.clickOnElement(PLAYTECHRESULT);
		Assert.assertEquals("https://www.playtech.com/", driver.getCurrentUrl());
	}

}
