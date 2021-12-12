package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "@C:\\Users\\admin\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\failjvm.txt" , 
glue = "org.stepdefinition" , monochrome = true)

public class FailedRunnerClass {
	
	

}
