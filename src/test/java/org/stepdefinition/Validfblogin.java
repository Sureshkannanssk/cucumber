package org.stepdefinition;

import org.baseclass.BaseClassforAll;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pojoclass.PojoClassfroFb;

public class Validfblogin extends BaseClassforAll{
	


@When(": To launch the url of fb")
public void to_launch_the_url_of_fb() {
	
	geturl("https://en-gb.facebook.com");
}

PojoClassfroFb f ;
@When(": To pass the valid name{string} in Name Textbox")
public void to_pass_the_valid_name_in_Name_Textbox(String una) {
	
	f = new PojoClassfroFb();
	sendkeys(una, f.getTextBox() );
}

@When(": To pass the valid value{string} in password Textbox")
public void to_pass_the_valid_value_in_password_Textbox(String pwd) {
	
	sendkeys(pwd, f.getPassword());
}

@When(": To click the login button of fb")
public void to_click_the_login_button_of_fb() {
	
	click(f.getLogin());
}

@When(": To check whether its navigate to homepage or not check")
public void to_check_whether_its_navigate_to_homepage_or_not_check() {
	
	System.out.println("im happy");
}

//@Then(": Finally close the Browservali")
//public void finally_close_the_Browservali() {
//
//close();
//}


}
