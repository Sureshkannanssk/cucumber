package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClassforAll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import pojoclass.PojoClassfroFb;


public class Datatable1 extends BaseClassforAll{
	


@When(": To launch the url db")
public void to_launch_the_url_db() {
	geturl("https://en-gb.facebook.com");
}

PojoClassfroFb p;

@When(": To pass the valid name in Name Textbox db")
public void to_pass_the_valid_name_in_Name_Textbox_db(DataTable d) {

	Map<String, String> asMap = d.asMap(String.class, String.class);
	 p = new PojoClassfroFb();
     sendkeys(asMap.get("email2"), p.getTextBox());
	}


@When(": To pass the valid value in password Textbox db")
public void to_pass_the_valid_value_in_password_Textbox_db(DataTable a) {
	
	Assert.assertTrue(false);
	List<Map<String,String>> asMaps = a.asMaps();
	 p = new PojoClassfroFb();
	 sendkeys(asMaps.get(1).get("pass1"), p.getPassword());
	 
	
}

@When(": To click the login button db")
public void to_click_the_login_button_db() {
	
	 click(p.getLogin());
}


}
