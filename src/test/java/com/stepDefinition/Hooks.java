package com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks extends BaseClass {

	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "/Users/havanur/Desktop/Shruthi_Automation/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

	}

	@After
	public void close() {
		driver.close();

	}

}
