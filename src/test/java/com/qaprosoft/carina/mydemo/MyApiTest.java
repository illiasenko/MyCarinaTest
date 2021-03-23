package com.qaprosoft.carina.mydemo;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.myapi.MyGetUserMethod;
import com.qaprosoft.carina.demo.myapi.MyPostLoginMethod;
import com.qaprosoft.carina.demo.myapi.MyPostRegisterMethod;

public class MyApiTest extends AbstractTest {

	@Test(description = "GetUser")
	@MethodOwner(owner = "me")
	public void testGetUsers() {
		MyGetUserMethod getUsersMethods = new MyGetUserMethod();
        getUsersMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUsersMethods.callAPI();
        getUsersMethods.validateResponse();
	}
	
	@Test(description = "RegisterUser")
	@MethodOwner(owner = "me")
	public void testRegisterUser() {
		MyPostRegisterMethod registerMethod = new MyPostRegisterMethod();
		registerMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		registerMethod.callAPI();
		registerMethod.validateResponse();
	}
	@Test(description = "LoginUser")
	@MethodOwner(owner = "me")
	public void testLoginUser() {
		MyPostLoginMethod loginMethod = new MyPostLoginMethod();
		loginMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		loginMethod.callAPI();
		loginMethod.validateResponse();
	}
	
}

