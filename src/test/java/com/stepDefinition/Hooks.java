package com.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks extends BaseClass {

	@Before
	// only chrome execution
	/*
	 * public void start() { System.setProperty("webdriver.chrome.driver",
	 * "/Users/havanur/Desktop/Shruthi_Automation/chromedriver"); driver = new
	 * ChromeDriver(); driver.manage().deleteAllCookies();
	 * 
	 * }
	 */

	public static void before() {

		String browserName = System.getenv("browserName");
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/havanur/Desktop/Shruthi_Automation/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			// Set gecko driver path and initiate firefox
			System.setProperty("webdriver.gecko.driver", "/Users/havanur/Desktop/Shruthi_Automation/geckodriver");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			// Set SafariDriver path and initiate Safari
			driver = new SafariDriver();
		} else {
			System.out.println("Error Message----> " + "browser name not mentioned properly");
			System.exit(0);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void close() {
		driver.close();

	}

}
