package com.runner;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/features/",
		          glue = { "com.stepDefinition" },
				  plugin = { "pretty","html:target/cucumber-html-report" }

				  //tags="@sprint -no","@regression"
 
				)


public class CucumberRunner {

}
