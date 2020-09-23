package com.petstore.tests;

//import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

import com.petstore.util.PropertyReader;
import io.qameta.allure.Step;
import io.restassured.RestAssured;

public class TestBase {
	
	public static PropertyReader property;
	
	@BeforeAll
	@Step("This is the Base class with Base URL")
	public static void initUrl() {
		property= PropertyReader.getInstance();
		RestAssured.baseURI = property.getProperty("baseUrl");
	}
	
}
