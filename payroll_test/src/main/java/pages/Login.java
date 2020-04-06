package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class Login {

	WebDriver driver;
	
	  public Login(WebDriver driver)
	    {
	    	this.driver= driver;
	    	PageFactory.initElements(driver, this);
	    }
	
    @FindBy(id="loginform-username")
    WebElement name;
    @FindBy(id="loginform-password")
    WebElement pass;
    @FindBy(name="login-button")
    WebElement submit;
    
    public void login(String userName, String password) {
    	name.sendKeys(userName);
    	pass.sendKeys(password);
    	submit.click();
    	
    }
}
