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

/**
 * This sample shows how create Web test.
 * 
 * @author qpsdemo
 */
public class MyLoginTest extends AbstractTest {

	private String username = "firstcarinatest2021@gmail.com";
	private String password = "Myfirsttest1";

	@Test(description = "Login_test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P2)
    @TestTag(name = "area test", value = "web")
	public void testMyAccount() {
				
		
		
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened");
		homePage.openMyAccount();
		MyLoginPage loginPage = new MyLoginPage(getDriver());
		loginPage.chooseLogin();
		loginPage.inputAccount(username);
		loginPage.inputPassword(password);
		loginPage.selectRobotCheck();
		loginPage.loginToAccount();
		
	}		
}

