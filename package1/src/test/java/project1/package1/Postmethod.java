package project1.package1;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class Postmethod {
	
	public static void main(String[] args) {
		
		Data A = new Data();
		A.setId(5);
		A.setTitle("Ashu kumar5");
		A.setAuthor(" Author5");
		
		
		given()
		.contentType(ContentType.JSON)
		.body(A)
		.when()
		.post("http://localhost:3000/posts")
		.then()
		.statusCode(201);
		
				
	}
	
	
	
}


