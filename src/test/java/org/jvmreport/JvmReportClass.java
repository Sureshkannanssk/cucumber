package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {
	
	public static void jvmReport(String jsonfpath) {

		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\CucumberPractice\\src\\test\\resources");
	
	    Configuration c = new Configuration(f, "Facebook & Amazon");
	    c.addClassifications("Platform name", "Windows");
	    c.addClassifications("Platform version", "10");
	    
	   List<String> l = new ArrayList<String>();
	   l.add(jsonfpath);
	
	    ReportBuilder rp = new ReportBuilder(l, c); 
	    
	    rp.generateReports();
	
	
	
	
	
	
	
	}
	
	
	

}
