package com.qaprosoft.carina.demo.gui.mypages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class MyAdvertisment extends AbstractPage {
	
	
	@FindBy(id = "postNewAdLink")
	private ExtendedWebElement pressAd;
	
	@FindBy(xpath = "//*[contains(@class,'text x-normal light br4 xxx-long2 required')]")
	private ExtendedWebElement enterHead;
	
	@FindBy(xpath = "//*[contains(@class,'dropdown light fleft')]")
	private ExtendedWebElement enterRubric;
	
	@FindBy(xpath = "//*[contains(@id,'add-description)]")
	private ExtendedWebElement enterDescription;
		
	@FindBy(xpath = "//*[@class='fblock clr cloud']")
	private ExtendedWebElement enterLocation;
	
	@FindBy(xpath = "//*[@class='dynamic-param-price__tab']")
	private ExtendedWebElement selectAdValue;
	
	@FindBy(xpath = "//*[contains(@name,'data[param_price][1])]")
	private ExtendedWebElement selectPrice;
	
	@FindBy(id = "targetid_private_business")
	private ExtendedWebElement selectSellerType;
	
	@FindBy(xpath = "//*[contains(@data-cy,'adding_button_save')]")
	private ExtendedWebElement pressConfirm;
	
	@FindBy(xpath = "//*[@class='caticon cat-icon-903']")
	private ExtendedWebElement chooseRubric;
	
	@FindBy(id = "targetparam4900003")
	private ExtendedWebElement chooseState;
	
	@FindBy(xpath = "//*[@class='olx-button olx-button--primary qa-bundle-basic'")
	private ExtendedWebElement addPrice;
	
	@FindBy(xpath = "//*[contains(@class,'text x-normal light br4 required')]")
	private ExtendedWebElement enterPerson;
	
	@FindBy(id = "goToProviders")
	private ExtendedWebElement payAdd;

	public MyAdvertisment(WebDriver driver) {
		super(driver);
	}
	  public void pressAddButton() {
		     pressAd.click();
		    }
	  public void pressConfirmButton() {
		  pressConfirm.click();
	  }
	  	  public void inputHeader(String header) {
		    enterHead.type(header);
	 }
	  public String headerEnter() {
		  assertElementPresent(enterHead);
		  return enterHead.getText();
	  }
	  public void enterRubric() {
		  enterRubric.click();
	  }
	  	  public void pickRubric() {
		  chooseRubric.click();
	  }
	  public void inputDescription(String description) {
		 enterDescription.click();
	  }
	  public String DescriptionEnter() {
		  assertElementPresent(enterDescription);
		  return enterDescription.getText();
	  }	  
	  public void selectValue() {
		  selectAdValue.click();
	  }
	  public void selectPrice() {
		  addPrice.click();
	  }
	
	  public void enterPrice(String price) {
		  selectPrice.type(price);
	  }
	  public String priceSelect() {
		  assertElementPresent(selectPrice);
		  return selectPrice.getText();
	  }
	  public void stateSelection() {
		  chooseState.click();
	  }
	  
	 public void payForTheAd() {
		 payAdd.click();
	 }
	 
	 public void sellerSelection() {
		 selectSellerType.click();
	 }
	 
	public void inputLocation(String location) {
		enterLocation.type(location);
	}
	
	public String LocationEnter() {
		assertElementPresent(enterLocation);
		return enterLocation.getText();
	}
	public void inputSeller(String seller) {
		enterPerson.type(seller);
	}
	public String SellerEnter() {
		assertElementPresent(enterPerson);
		return enterPerson.getText();
	}
 }

