package com.qaprosoft.carina.demo.myapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class MyPostRegisterMethod extends AbstractApiMethodV2 {
	
    public MyPostRegisterMethod() {
      super("api/regress/register/rq.json", "api/regress/register/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
//        request.header("login", "eve.holt@reqres.in");
//        request.header("password", "pistol");
      }
}