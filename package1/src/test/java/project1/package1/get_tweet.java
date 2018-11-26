package project1.package1;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class get_tweet {
	
	public static void main(String[] args) {
		
		

		String consumer_key="j8yk887WwoWoq8Tj6xCkxxpLa";
		String Consumer_Secret="BL7bsVCa4i8TLGipuMRsy9ElmUMFyldGsAuUIX4fKdQzQhYeYs";
		
	    String Access_token="1062358020099690498-ZniPABwnouaBnbsVgCCveI2TOCKRGo";
	    String token_secret="7uJ22ayg6vUIuu3ZwMd45brZ7PkGKNdaIsDmRXsRwWW7R";
	    
	    RestAssured.baseURI="https://api.twitter.com/1.1/statuses";
	    
	    Response res=given()
	    		.contentType(ContentType.JSON)
	    		.auth()
	    		
	    		.oauth(consumer_key, Consumer_Secret, Access_token, token_secret)
	    		.queryParam("count", "2")
	    		.when()
	    		.get("home_timeline.json").then().extract().response();
	    
	   String tweet=  res.jsonPath().get("[0].text");
	    
	    System.out.println(tweet);
	    
	    		
	      
	    		
	    
	}

}
