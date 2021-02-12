package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
		System.out.println("IN gotoemp");

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE, Keys.ENTER);
		Thread.sleep(1000);
		// driver.find_elements_by_xpath("//*[contains(text(), 'My Button')]")

	}

	public void notinPlaytech() {

		Assert.assertEquals("Sorry you must be over 18 to enter.", driver.findElement(AGEERROR).getText());

	}

}
