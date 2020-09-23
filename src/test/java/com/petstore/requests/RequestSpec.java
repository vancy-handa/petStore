package com.petstore.requests;


import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {


	public static RequestSpecification logPayloadResponseInfo() {
		
		RequestSpecBuilder logs;
		RequestSpecification logSpecification;
		
		logs = new RequestSpecBuilder();
		
		logs.addFilter(new AllureRestAssured());
		logSpecification = logs.build();
		return logSpecification;

	}
	
}
