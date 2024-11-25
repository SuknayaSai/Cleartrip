package com.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\sukanya\\CogecoCucumber\\src\\test\\resources\\cleartrip.feature",
	     glue="com.cleartrip",
	     dryRun=false,
	     monochrome=true,
	     tags="@Cleartrip",
//	     strict=true
	     plugin= {"html:target","json:target/report.json"}
	)
	public class TestRunner {

	}

