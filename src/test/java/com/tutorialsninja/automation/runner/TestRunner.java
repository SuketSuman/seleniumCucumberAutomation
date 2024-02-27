package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:FeatureFiles/AIvaluation.feature" }, glue = {
		"classpath:com.tutorialsninja.automation.stepdef" }, monochrome = true, plugin = {
				"html:target/cucumber_html_report", "json:target/cucumber.json",
				"junit:target/cucumber.xml" }, tags = { "@Email" })
public class TestRunner {

}
