package com.qaprosoft.carina.mydemo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import com.qaprosoft.carina.demo.gui.mypages.MyAdvertisment;
import com.qaprosoft.carina.demo.gui.mypages.MyHomePage;
import com.qaprosoft.carina.demo.gui.mypages.MyLoginPage;

/**
 * This sample shows how create Web test.
 * 
 * @author qpsdemo
 */
public class MyAdTest extends AbstractTest {

	private String username = "firstcarinatest2021@gmail.com";
	private String password = "Myfirsttest1";
		
	@Test(description = "Ad_test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P5)
    @TestTag(name = "area test", value = "web")
	public void AdTest () {
		
		final String header = "This is my first ad....First ad!";
		final String description = "This is my first product , i want to sell!";
		final String price = "1000";
		final String location = "Черновцы";
		final String seller = "Illia";
		
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		MyLoginPage loginPage = new MyLoginPage(getDriver());
		loginPage.inputAccount(username);
		loginPage.inputAccount(password);
		Assert.assertEquals(loginPage.readAccount(), "Carinatest2021@gmail.com", "Invalid log info!");
		Assert.assertEquals(loginPage.readPassword(), "Myfirsttest1", "Invalid pass info!");
		loginPage.selectRobotCheck();
		loginPage.loginToAccount();
		MyAdvertisment adPage = new MyAdvertisment(getDriver());
		adPage.pressAddButton();
		Assert.assertFalse(adPage.isPageOpened(), "Registration page is not opened!");
		adPage.inputHeader(header);;
		Assert.assertEquals(adPage.headerEnter(), "header", "Header is unavailable!");
		adPage.enterRubric();
		adPage.pickRubric();
		adPage.inputDescription(description);
		Assert.assertEquals(adPage.DescriptionEnter(), "description", "Description is not entered");
		adPage.selectValue();
		adPage.enterPrice(price);
		Assert.assertEquals(adPage.priceSelect(), "price", "Price not entered!");
		adPage.stateSelection();
		adPage.sellerSelection();
		adPage.payForTheAd();
		adPage.inputLocation(location);
		Assert.assertEquals(adPage.LocationEnter(), "location", "Location is not selected!");
		adPage.inputSeller(seller);
		Assert.assertEquals(adPage.SellerEnter(), "seller", "Input seller name");
		adPage.pressConfirmButton();
		adPage.payForTheAd();
	}

}

