package runnerclass;

import javax.swing.text.html.HTML;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvmreport.JvmReportClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources" , glue = "org.stepdefinition" , monochrome = true , dryRun =false , 
plugin = {"html:target" , "junit:other reports//jre.xml" , "json:other reports//jsonrep.json" , "rerun:src/test/resources//failjvm.txt"} )
public class RunnerClass {

	@AfterClass
	public static void jvmREp() {
		
 JvmReportClass.jvmReport("C:\\Users\\admin\\eclipse-workspace\\CucumberPractice\\other reports\\jsonrep.json");
		
		
	}
	
}
