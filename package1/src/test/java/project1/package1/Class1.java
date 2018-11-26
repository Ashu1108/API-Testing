package project1.package1;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Class1 {
	
	
	public static void main(String[] args) {
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/posts/1");
		 
		System.out.println("Status of response code "+res.statusCode());
		System.out.println("Response data is"+res.asString());
		
	}

}
