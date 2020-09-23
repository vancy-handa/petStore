package com.petstore.requests;

import com.petstore.tests.TestBase;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestClient extends TestBase {
	
	@Step("This step is the GET request with path {0} and status as {1}")
	public Response doGetRequest(String requestPath, String status) {

		return RestAssured.given()
						  .queryParam("status", status)
						  .log()
						  .all()
						  .when()
						  //logPayloadResponseInfo method will print response in Allure report
						  .spec(RequestSpec.logPayloadResponseInfo())
						  .get(requestPath);
						  
					
	}
}
