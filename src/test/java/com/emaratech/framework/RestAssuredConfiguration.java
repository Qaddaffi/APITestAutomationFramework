package com.emaratech.framework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class RestAssuredConfiguration {

	Properties prop;
	FileInputStream fileinput;
	
public String getAccessToken() {
	
	String token ="158a483339019a3b61eb7e2eae729fbc47360ee18381dfff9a77045d7f32f886";
	return token;
	
}
	  
public void SetURIPath() throws IOException {
	
	prop = new Properties();
	fileinput = new FileInputStream("src/test/resources/PropertyFiles/EnvironmentURIs.properties");
	prop.load(fileinput);
	baseURI = prop.getProperty("LocalBaseURI");
	basePath = prop.getProperty("LocalBasePath");
	port = Integer.valueOf(prop.getProperty("LocalPort"));	
	System.out.println(" URI IS " + baseURI + port + basePath);
}

public RequestSpecification getRequestSpecification() {
       
	return RestAssured.given().contentType(ContentType.JSON).header("accessToken", this.getAccessToken());
	
    }

public Response getResponse(RequestSpecification requestSpecification,String endpoint) {
       
		Response response = requestSpecification.get(endpoint);
       // response.then().log().all();
        return response;
    }

}