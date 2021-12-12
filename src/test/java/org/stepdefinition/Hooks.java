package org.stepdefinition;

import org.baseclass.BaseClassforAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClassforAll {
	
	@Before(order = 1)
	
	public void Precondition() {

		browserLaunch();
		
		maximizewindow();
		System.out.println("browser launch");
	}
	
	

	@Before(order = 2)
	public void Hooks2() {
		System.out.println("order no 2");
		
	}

	@Before(order = 3)
	public void order3() {
		System.out.println("order no 3");
	}

	@After(order = 3)
	public void org(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] scc = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(scc, "image/png");
			System.out.println("failed   : " + s.getName());   //console print
			
			
		}

	}

	
	@After(order = 1)
	public void postcondition() {

		System.out.println("close the browser");
		close();
	}
	
	
	

}
