package com.qaprosoft.carina.demo.gui.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MyLoginPage extends AbstractPage {
	

	@FindBy (id = "login_tab")
	private ExtendedWebElement loginPick;
	
	@FindBy (xpath = "//*[contains(@title,'Email или номер телефона')]")
	private ExtendedWebElement userEmail;
			
	@FindBy(xpath = "//*[contains(@title,'Ваш текущий пароль от OLX')]")
	private ExtendedWebElement userPass;
	
	@FindBy(xpath =  "//*[contains(@id,'recaptcha-anchor')]")
	private ExtendedWebElement robotCheck;
	
	@FindBy(id = "se_userLogin")
	private ExtendedWebElement loginButton;
	
	@FindBy(id = "register_tab")
	private ExtendedWebElement registerTab;
	
	
	 public MyLoginPage(WebDriver driver) {
	        super(driver);
	    }

	  	public void chooseLogin() {
	  		loginPick.click();
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
	    	    
	    public void loginToAccount() {
	   	    	loginButton.click();
	    }

	    public void enterRegistration() {
	    	registerTab.click();
	    }

		public void selectRobotCheck() {
			robotCheck.click();
			
		}
    
	    
}
