
package com.petstore.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.petstore.requests.Pets;

import io.qameta.allure.Description;
import io.qameta.allure.Link;


public class PetTests extends TestBase{
	Pets pet = new Pets();

	@DisplayName("Get the Pet count with Status as Available and Name as Doggie")
	@Link("https://petstore.swagger.io/#/pet/findPetsByStatus")
	@Description("This is a Test Method to find the number of Pets with Status as Available and Name as Doggie from PetStore")
	@Test
	public void getPetsByStatus() {
		pet.getCountOfPetsWithName();		
	}
}
