package com.qaprosoft.carina.mydemo;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestTag;
import com.qaprosoft.carina.demo.gui.mypages.MyHomePage;
import com.qaprosoft.carina.demo.gui.mypages.MyLoginPage;

public class MyFailLoginTest extends AbstractTest{

	
	private String username = "firstcarinatest2021@gmail.com";
	private String password = "Myfirsttest1";
	
	@Test(description = "Search_test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
	 @TestTag(name = "area test", value = "web")
	public void runFailTest() {
		
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		homePage.openMyAccount();
		MyLoginPage loginPage = new MyLoginPage(getDriver());
		loginPage.inputAccount(username);
		loginPage.inputPassword(password);
		String actualLogin = loginPage.getName();
		Assert.assertNotEquals(actualLogin, loginPage, actualLogin);
		loginPage.selectRobotCheck();
		loginPage.loginToAccount();
	}
}
