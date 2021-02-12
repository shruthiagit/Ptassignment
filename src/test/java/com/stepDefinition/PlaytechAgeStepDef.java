package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PlaytechAgeStepDef extends BaseClass {

	@When("^I enter the valid age$")
	public void i_enter_the_valid_age() throws Throwable {
		playtechAgePage.enterDay(10);
		playtechAgePage.enterMonth(01);
		playtechAgePage.enterYear(19);
		playtechAgePage.ageClick();
	}

	@When("^I can go into the website$")
	public void i_can_go_into_the_website() throws Throwable {
		playtechAgePage.inPlaytech();
	}

	@Then("^I navigate to About Us Page$")
	public void i_navigate_to_About_Us_Page() throws Throwable {
		playtechAgePage.aboutUs();
	}
	
	@When("^I enter the invalid age$")
	public void i_enter_the_invalid_age() throws Throwable {
		playtechAgePage.enterDay(02);
		playtechAgePage.enterMonth(01);
		playtechAgePage.enterYear(02);
		playtechAgePage.ageClick();
	}
	
	@When("^I cannot go into the website$")
	public void i_cannot_go_into_the_website() throws Throwable {
		playtechAgePage.notinPlaytech();
	}

}
