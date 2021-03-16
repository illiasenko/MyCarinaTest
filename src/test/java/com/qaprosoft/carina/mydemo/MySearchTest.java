package com.qaprosoft.carina.mydemo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import com.qaprosoft.carina.demo.gui.mypages.MyHomePage;
import com.qaprosoft.carina.demo.gui.mypages.MySearchPage;

public class MySearchTest extends AbstractTest{
	
	
	@Test(description = "Search_test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
	 @TestTag(name = "area test", value = "web")
	
		public void testSearch() {
		
		final String minPrice = "3500";
		final String maxPrice = "4500";
		final String motoName = "ZongShen qt-50 65cc";
		final String place = "Черновцы";
		
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		homePage.pickRubrick();
		homePage.pickMoto();
		MySearchPage searchPage = new MySearchPage(getDriver());
		searchPage.inputMotoName(motoName);
		searchPage.inputMinPrice(minPrice);
		searchPage.inputMaxnPrice(maxPrice);
		searchPage.inputCityName(place);
		Assert.assertEquals(searchPage.readCityName(), "city name", "Entered name is invalid");
		Assert.assertEquals(searchPage.readMinPrice(), "minPrice", "Invalid min price");
		Assert.assertEquals(searchPage.readMaxPrice(), "minPrice", "Invalid min price");
		Assert.assertEquals(searchPage.readMotoName(), "ZongShen qt-50 65cc", "Invalid min price");
		searchPage.pickMoto();
		searchPage.submitSearch();
	}
}
