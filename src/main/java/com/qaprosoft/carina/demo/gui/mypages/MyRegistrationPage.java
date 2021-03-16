package com.qaprosoft.carina.demo.gui.mypages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MyRegistrationPage extends AbstractPage{
	
	@FindBy(xpath = "//*[@id,'register_tab']")
	private ExtendedWebElement registerTab;
	
	@FindBy(id = "userEmailPhoneRegister")
	private ExtendedWebElement enterValidEmail;
	
	@FindBy(xpath = "//*[contains(@relname,'register[rules]')]")
	private ExtendedWebElement acceptTerms;
	
	@FindBy(id = "UserPassRegister")
	private ExtendedWebElement enterValidPassword;
	
	@FindBy(id = "button_register")
	private ExtendedWebElement pressRegisterButton;
	
	
	public MyRegistrationPage(WebDriver driver) {
		super(driver);
			}
	
	public void enterEmail(String name) {
		enterValidEmail.type(name);
}
	
	public boolean isTermAccepted() {
		acceptTerms.click();
		return false;
	}
	
	public void enterPassword(String password) {
		enterValidPassword.type(password);
	}
	public void enterRegisterButton() {
		pressRegisterButton.click();
		
	}
		  public String newAccount() {
		        assertElementPresent(enterValidEmail);
		        return enterValidEmail.getText();
		    }
		  
		    public String newPassword() {
		        assertElementPresent(enterValidPassword);
		        return enterValidPassword.getText();
	}
}

