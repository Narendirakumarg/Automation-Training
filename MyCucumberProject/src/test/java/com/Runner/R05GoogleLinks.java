package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F05GoogleLinks.feature"},
					glue = {"com.StepDef"},
					publish = true,
					plugin = {"json:Reports/Cucumber-json.json", 
							"junit:Reports/xmlReport.xml"},
					tags = "@AllGoogleLinks")
public class R05GoogleLinks {
	/*
	 Execute Single Scenario -> 	tags = "@TermsLink"
	 Execute Multiple Scenarios -> 	tags = "@TermsLink or @ImagesLink"
	 Skip Single Scenario -> 		tags = "not @StoreLink"
	 Skip multiple Scenarios ->		tags = "not @StoreLink and not @TermsLink"
	 
	  
	 */

}