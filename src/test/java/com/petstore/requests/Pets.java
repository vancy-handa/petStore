package com.petstore.requests;

import java.util.List;

import com.petstore.tests.TestBase;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class Pets extends TestBase{
	RestClient restClient = new RestClient();
	Response response;
	int petCount = 0;
	String petDoggie=property.getProperty("petName");

	@Step("Method 'getCountOfPetsWithName' calculates the total number of pets with name 'doggie'")
	public void getCountOfPetsWithName() {
		
		//path and status value for the below Get method is retrieved from properties file
		response = restClient.doGetRequest("/pet/findByStatus", property.getProperty("status"));
		
		//This step gets the name of all the pets in the list
		List<String> petsNames=response.then()
									   .extract()
									   .path("name");

		//For each is used to iterate over the list of names and verify with name- doggie and gets the total count
		for(String petsName:petsNames) {
			try {
				if(petsName.equalsIgnoreCase(petDoggie)) {
					petCount = petCount+1;
				}
			}
			//This is to handle the exception when Pet has No Name
			catch(NullPointerException e) {

			}
		}
		System.out.println("Pet Count is- "+petCount);
	}
}
