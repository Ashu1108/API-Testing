package org.testing.testSteps;

import static  com.jayway.restassured.RestAssured.*;

import java.io.IOException;

import org.testing.utilities.PropertiesRead;
import org.testing.utilities.ResponseParsing;
import org.testing.utilities.ResponseValidation;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	PropertiesRead pr; // make a constructor  
	public HTTPMethods(PropertiesRead pr) 
	
	{
		this.pr = pr;
		
	}
	
	
	public void GetRequest(String EnvironmentName) throws IOException
	{
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.ReadProperty(EnvironmentName));
				
				System.out.println(res.asString());
				
				ResponseValidation.Res_validate(res, 200, "application/json; charset=utf-8");
				ResponseParsing.Response_Content_Compare(res, pr, "json-server", "title");
		
	}

	public void PostRequest()
	{
		
	}
}
