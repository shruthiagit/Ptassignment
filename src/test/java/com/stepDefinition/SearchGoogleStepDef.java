package com.stepDefinition;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchGoogleStepDef extends BaseClass {
	@Given("^I am in Google page$")
	public void i_am_in_Google_page() throws Throwable {
		searchGooglePage.verifySearchGooglePage();
	}

	@Given("^I select Playtechpage$")
	public void i_select_Playtechpage() throws Throwable {
		searchGooglePage.searchPlaytech();
		searchGooglePage.playtechSearchResults();
	}
}