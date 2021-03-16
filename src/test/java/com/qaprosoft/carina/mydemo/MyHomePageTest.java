package com.qaprosoft.carina.mydemo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.demo.gui.mypages.MyHomePage;

public class MyHomePageTest extends AbstractTest{

	
	@Test(description = "HomePage_Test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
	public void testHomePage() {
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
	}
	
}
