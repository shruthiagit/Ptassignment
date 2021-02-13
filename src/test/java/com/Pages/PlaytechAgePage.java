package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

public class PlaytechAgePage extends BaseClass {

	public static By SELECTDROPDAY = By.cssSelector("[name=day]");
	public static By SELECTDROPMONTH = By.cssSelector("[name=month]");
	public static By SELECTDROPYEAR = By.cssSelector("[name=year]");
	public static By SUBMITAGE = By.cssSelector(".submit");
	public static By PLAYTECHRESULT = By.xpath("//a[@href = 'https://www.playtech.com/']");
	public static By ABOUTUS = By.xpath("//a[@href = '/about-us']"); // btn-default
	// public static By ABOUTUS = By.cssSelector(".btn-default");
	// public static By ABOUTUS = By.linkText("About Us ");
	// public static By ABOUTUS = By.linkText("About Us");
	public static By CLOSECOOKIE = By.cssSelector("#close-cookie");
	public static By AGEERROR = By.cssSelector(".age-error");
	public static By MSGS = By.cssSelector(".stat-name");
	public static By COUNT = By.cssSelector(".stat-count");

	public void inPlaytech() {

		Assert.assertEquals("https://www.playtech.com/", driver.getCurrentUrl());

	}

	public void enterDay(int day) {

		Select objSelectday = new Select(driver.findElement(SELECTDROPDAY));
		objSelectday.selectByIndex(day);

	}

	public void enterMonth(int month) {

		Select objSelectmonth = new Select(driver.findElement(SELECTDROPMONTH));
		objSelectmonth.selectByIndex(month);

	}

	public void enterYear(int year) {

		Select objSelectyear = new Select(driver.findElement(SELECTDROPYEAR));
		objSelectyear.selectByIndex(year);

	}

	public void ageClick() {

		action.clickOnElement(SUBMITAGE);
		Assert.assertEquals("Enter Site", driver.findElement(SUBMITAGE).getText());

	}

	public void aboutUs() {

		action.clickOnElement(CLOSECOOKIE);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB, Keys.ENTER);
		Assert.assertEquals("https://www.playtech.com/about-us", driver.getCurrentUrl());

	}

	public void gotoEmpSection() throws InterruptedException {
		Assert.assertEquals("https://www.playtech.com/about-us", driver.getCurrentUrl());

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(5000);
		Assert.assertEquals("Number of Employees", driver.findElements(MSGS).get(0).getText());
		String empcount = driver.findElements(COUNT).get(0).getText().trim().replaceAll("[\\n\\r,]", "");
		invalidatecount(5901, empcount);
		validatecount(5900, empcount);
	}

	public void gotoCountriesSection() throws InterruptedException {

		Assert.assertEquals("Number of countries Playtech has offices", driver.findElements(MSGS).get(1).getText());
		String countriescount = driver.findElements(COUNT).get(1).getText().trim().replaceAll("[\\n\\r,]", "");
		invalidatecount(34, countriescount);
		validatecount(19, countriescount);

	}

	public void gotoLicensesSection() throws InterruptedException {

		Assert.assertEquals("Global licensees", driver.findElements(MSGS).get(2).getText());
		String licensescount = driver.findElements(COUNT).get(2).getText().trim().replaceAll("[\\n\\r,]", "");
		invalidatecount(141, licensescount);
		validatecount(140, licensescount);
	}

	public void gotoJurisdictionsSection() throws InterruptedException {

		Assert.assertEquals("Regulated Jurisdictions", driver.findElements(MSGS).get(3).getText());
		String jurisdictioncount = driver.findElements(COUNT).get(3).getText().trim().replaceAll("[\\n\\r,]", "");
		invalidatecount(21, jurisdictioncount);
		validatecount(20, jurisdictioncount);
	}

	public void notinPlaytech() {

		Assert.assertEquals("Sorry you must be over 18 to enter.", driver.findElement(AGEERROR).getText());

	}

	public void invalidatecount(int num, String count) {

		Assert.assertNotEquals(num, Integer.parseInt(count));

	}

	public void validatecount(int num, String count) {

		Assert.assertEquals(num, Integer.parseInt(count));

	}

}
