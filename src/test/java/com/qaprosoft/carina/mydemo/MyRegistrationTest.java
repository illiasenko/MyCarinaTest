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
import com.qaprosoft.carina.demo.gui.mypages.MyRegistrationPage;

/**
 * This sample shows how create Web test.
 * 
 * @author qpsdemo
 */
public class MyRegistrationTest extends AbstractTest {

	private String username = "firstcarinatest2021@gmail.com";
	private String password = "Myfirsttest1";
	
	
	@Test(description = "Register_test")
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P4)
    @TestTag(name = "area test", value = "web")
	
	public void registrationTest() {
		MyHomePage homePage = new MyHomePage(getDriver());
		homePage.open();
		homePage.openMyAccount();
		MyLoginPage loginPage = new MyLoginPage(getDriver());
		loginPage.enterRegistration();
		MyRegistrationPage registerPage = new MyRegistrationPage(getDriver());
		registerPage.enterEmail(username);
		registerPage.enterPassword(password);
		Assert.assertEquals(registerPage.newAccount(), "username", "Entered e-mail is invalid!" );
		Assert.assertEquals(registerPage.newPassword(), "password", "Entered password is incorect!");
		registerPage.isTermAccepted();
		Assert.assertFalse(registerPage.isTermAccepted(), "Terms are not accepted");
		registerPage.enterRegisterButton();
			}

}

