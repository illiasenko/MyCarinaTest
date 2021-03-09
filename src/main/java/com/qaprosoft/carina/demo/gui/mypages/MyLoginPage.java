package com.qaprosoft.carina.demo.gui.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MyLoginPage extends AbstractPage {
	

	@FindBy (id = "UserEmail")
	private ExtendedWebElement userEmail;
	
	@FindBy(id = "UserPass")
	private ExtendedWebElement userPass;
	
	@FindBy(xpath =  "//*[contains(@class,'rc-anchor-error-msg-container')]")
	private ExtendedWebElement robotCheck;
	
	@FindBy(id = "se_userLogin")
	private ExtendedWebElement loginButton;
	
	@FindBy(xpath = "//a[@class='login-button login-button--facebook']")
	private ExtendedWebElement loginWithFacebookButton;
	
	@FindBy(id = "register_tab")
	private ExtendedWebElement registerTab;
	
	
	 public MyLoginPage(WebDriver driver) {
	        super(driver);
	    }

	  
	    public void inputAccount(String name) {
	    userEmail.type(name);
	    }
	
	    public void inputPassword(String password) {
	     userPass.type(password);

	    }

	    public String readAccount() {
	        assertElementPresent(userEmail);
	        return userEmail.getText();
	    }
	  
	    public String readPassword() {
	        assertElementPresent(userPass);
	        return userPass.getText();
	    }    
	    public void selectRobotCheck() {
	        robotCheck.click();
	    }
	  
	    public void loginToAccount() {
	    	loginButton.click();
	    }
	    
	    public void loginViaFacebook() {
	    	loginWithFacebookButton.click();
	    }
	    
	    public void enterRegistration() {
	    	registerTab.click();
	    }
    
	    
}
