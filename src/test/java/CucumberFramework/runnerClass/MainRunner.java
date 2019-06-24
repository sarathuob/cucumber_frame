package CucumberFramework.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions (
features = {"src\\test\\java\\CucumberFramework\\featurefile\\"},
glue = {"CucumberFramework.stepfiles"},
plugin = {"pretty", "html:target/cucumber",
		"json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		
)



public class MainRunner {
	
		
	}

