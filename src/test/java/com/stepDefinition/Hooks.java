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



	@When("^I stay in the same window for playtech\\.com website$")
	public void i_stay_in_the_same_window_for_playtech_com_website() throws Throwable {

	}

	@When("^I am in about us page$")
	public void i_am_in_about_us_page() throws Throwable {

	}

	@When("^I get the number of employees$")
	public void i_get_the_number_of_employees() throws Throwable {

	}

	@When("^I get the number of countries$")
	public void i_get_the_number_of_countries() throws Throwable {

	}

	@When("^I get the number of global licenses$")
	public void i_get_the_number_of_global_licenses() throws Throwable {

	}

	@When("^I get the Regulated Jurisdictions$")
	public void i_get_the_Regulated_Jurisdictions() throws Throwable {

	}

	@Then("^I validate with the number of my choice$")
	public void i_validate_with_the_number_of_my_choice() throws Throwable {

	}



	@After
	public void close() {
		driver.close();

	}

}
