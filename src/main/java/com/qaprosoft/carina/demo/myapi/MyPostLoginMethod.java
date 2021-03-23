package com.qaprosoft.carina.demo.myapi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class MyPostLoginMethod extends AbstractApiMethodV2 {
	
	
    public MyPostLoginMethod() {
        super("api/regress/login/rq.json", "api/regress/login/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
    
}
