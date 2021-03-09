package com.qaprosoft.carina.demo.gui.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class MyHomePage extends AbstractPage{
	
	@FindBy(xpath = "//*[contains(@id,'innerLayout')]")
	private ExtendedWebElement homePage;
		
	@FindBy(xpath = "//*[contains(@href,'https://www.olx.ua/myaccount/')]")
	private ExtendedWebElement myAccountButton;


	public MyHomePage(WebDriver driver) {
		super(driver);
	}
	public void openMyAccount() {
		myAccountButton.click();
	}
}
