package org.testing.utilities;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidation {
	
	
	public static void Res_validate(Response res, int ExpectedStatusCode, String ContentType)
	{
		
		Assert.assertEquals(res.statusCode(), ExpectedStatusCode);
		System.out.println("Status code matches");
		Assert.assertEquals(res.contentType(), ContentType);
		System.out.println("Content type matches");
		
	}


	}
	


