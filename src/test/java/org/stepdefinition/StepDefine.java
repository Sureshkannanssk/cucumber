package org.stepdefinition;

import org.baseclass.BaseClassforAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pojoclass.PojoClassfroFb;

public class StepDefine extends BaseClassforAll{

	WebDriver driver;
	
//@Given(": To launch the chrome browser and maximize")
//public void to_launch_the_chrome_browser_and_maximize() {
//	browserLaunch();
//	maximizewindow();
//}

@When(": To launch the url")
public void to_launch_the_url() {
	geturl("https://en-gb.facebook.com");
	
}

PojoClassfroFb p;
@When(": To pass the invalid name in Name Textbox")
public void to_pass_the_invalid_name_in_Name_Textbox() {
	
	 p = new PojoClassfroFb();
	
sendkeys("suresh", p.getTextBox());
	
	
//	WebElement mail = driver.findElement(By.id("email"));
//	mail.sendKeys("suresh");
}

@When(": To pass the invalid value in password Textbox")
public void to_pass_the_invalid_value_in_password_Textbox() {
	
	 p = new PojoClassfroFb();
	 
	 sendkeys("12345", p.getPassword());
	
//	WebElement pas = driver.findElement(By.id("pass"));
//	pas.sendKeys("12345");
}

@When(": To click the login button")
public void to_click_the_login_button() {

	 p = new PojoClassfroFb();
	 
	 click(p.getLogin());
	
//	WebElement cli = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//	cli.click();
	}

@When(": To check whether its navigate to homepage or not")
public void to_check_whether_its_navigate_to_homepage_or_not() {
	
	System.out.println("its not working");
}


//@Then(": Finally close the Browser")
//public void finally_close_the_Browser() {
//	
//	close();
//}



}
