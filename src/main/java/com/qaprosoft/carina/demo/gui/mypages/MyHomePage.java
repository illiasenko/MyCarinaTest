package com.qaprosoft.carina.demo.gui.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MyHomePage extends AbstractPage{
	
	@FindBy(xpath = "//*[contains(@id,'innerLayout')]")
	private ExtendedWebElement homePage;
		
	@FindBy(xpath = "//*[contains(@href,'https://www.olx.ua/myaccount/')]")
	private ExtendedWebElement myAccountButton;
	
	@FindBy(xpath = "//*[contains(@id,'submit-searchmain')]")
	private ExtendedWebElement searchButton;
	
	@FindBy(xpath = "//*[contains(@href,'https://www.olx.ua/transport/')]")
	private ExtendedWebElement transportSelect;
	
	@FindBy(xpath = "//*[contains(@href,'https://www.olx.ua/transport/moto/')]")
	private ExtendedWebElement motoSelect;
	

	public MyHomePage(WebDriver driver) {
		super(driver);
	}
	public void openMyAccount() {
		myAccountButton.click();
	}
	
	public void openSearchPage() {
		searchButton.click();
	}
	public void pickRubrick() {
		transportSelect.click();
	}
	public void pickMoto() {
		motoSelect.click();
	}
}
