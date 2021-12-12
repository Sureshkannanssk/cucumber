package pojoclass;

import org.baseclass.BaseClassforAll;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassfroFb extends BaseClassforAll{
	
	   public PojoClassfroFb() {

	   PageFactory.initElements(driver, this);
   
   }
   
	   @CacheLookup
   @FindBy(id="email")
   private WebElement TextBox;
   
	   @CacheLookup
    @FindBy(name="pass")
   private WebElement Password;
   
   
@CacheLookup
@FindBy(name="login")
   private WebElement clicl;

@CacheLookup
   @FindAll
   ({
	   @FindBy(xpath = "//button[@name='login']"),
	   @FindBy(xpath= "//button[@id=\"loginbutton\"]"),
	   @FindBy(xpath = "//button[@type=\"submit\"]")
	   })
   private WebElement login;
   
   

   
   public WebElement getTextBox() {
	return TextBox;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getClicl() {
	return clicl;
}

public WebElement getLogin() {
	return login;
}
   
}
