package org.testing.utilities;

import java.io.IOException;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseParsing {

	
	

	



public static void Response_Content_Compare(Response res, PropertiesRead pr, String ExpectedValue, String key) throws IOException {
	String actual_value=res.jsonPath().get(pr.ReadProperty(key));
	Assert.assertEquals(actual_value,ExpectedValue);
	
	
}
}
