package com.qaprosoft.carina.demo.gui.mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MySearchPage extends AbstractPage {
	
	@FindBy(xpath = "//*[contains(@class,'filter-item filter-item-from rel numeric-item price')]")
	private ExtendedWebElement minPriceSelect;
	
	@FindBy(xpath = "//*[contains(@class,'filter-item filter-item-to rel numeric-item price')]")
	private ExtendedWebElement maxPriceSelect;
	
	
//	@FindBy(xpath = "//*[contains(@id,'search-text')]")
//	private ExtendedWebElement searchButton;
	
	@FindBy(xpath = "//*[contains(@class,'tiptip {clickerId:'search-loop'}')]")
	private ExtendedWebElement searchButton;
	
	@FindBy(xpath = "//*[contains(@id,'cityField')]")
	private ExtendedWebElement regionSelect;
	
//	@FindBy(xpath = "//*[contains(@span,'Черновицкая область')]")
//	private ExtendedWebElement regionSelect;
//	
//	
	
	@FindBy(xpath = "//*[contains(@id,'a-region-369')]")
	private ExtendedWebElement citySelect;
	
	@FindBy(xpath = "//*[contains(@id,'search-submit')]")
	private ExtendedWebElement searchSubmit;
	
	
	@FindBy(xpath = "//*[contains(@href,'https://www.olx.ua/obyavlenie/zongshen-qt-50-65cc-IDKWLDd.html#61d0ed6dad')]")
	private ExtendedWebElement motoPick;
	
	public MySearchPage(WebDriver driver) {
		super(driver);
	}
	
	 public void inputMotoName(String motoName) {
	     searchButton.type(motoName);

	    }

	    public String readMotoName() {
	        assertElementPresent(searchButton);
	        return searchButton.getText();
	    }
	    
	    public void inputMinPrice(String minPrice) {
	    	minPriceSelect.type(minPrice);
	    }
	
	    public String readMinPrice() {
	    	assertElementPresent(minPriceSelect);
	    	return minPriceSelect.getText();
	    }
	    
	    public void inputMaxnPrice(String maxPrice) {
	    	maxPriceSelect.type(maxPrice);
	    }
	
	    public String readMaxPrice() {
	    	assertElementPresent(maxPriceSelect);
	    	return maxPriceSelect.getText();
	    }
	    
	    public void inputCityName(String cityName) {
	    	regionSelect.type(cityName);
	    }
	    
	    public String readCityName() {
	    	assertElementPresent(regionSelect);
	    	return regionSelect.getText();
	    }
	    
	   public void submitSearch() {
		   searchSubmit.click();
	   }
  
	   public void pickMoto() {
		   motoPick.click();
	   }

}
