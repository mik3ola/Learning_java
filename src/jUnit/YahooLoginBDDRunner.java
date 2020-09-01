package jUnit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C://Users//MIK3//eclipse-workspace//Learning_Selenium 2020//Features//yahooLogin.feature", 
		glue = "bDD")
public class YahooLoginBDDRunner {

}
 