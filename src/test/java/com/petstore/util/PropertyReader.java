package com.petstore.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	//this is a singleton class to have only one object
	
	//this is the only instance of the class
	private static PropertyReader propInstance;
	
	//private constructor to restrict the instantiation of the class
	private PropertyReader() {
		
	}
	
	//it returns the instance of the class. 
	//it is the global access point to get the instance of this class 
	public static PropertyReader getInstance() {
		
		if(propInstance == null){
			propInstance = new PropertyReader();
		}
		return propInstance;
	}
	
	
	public String getProperty(String propertyName) {
		Properties properties = new Properties();
		try {
			InputStream file = getClass().getClassLoader().getResourceAsStream("configuration.properties");
			properties.load(file);
			//it returns the value of the key in the property file
			if(properties.getProperty(propertyName) != null) {
				return properties.getProperty(propertyName);
			}
			//it throws exception if value is null or key is not defined in the property file
			else{
				throw new RuntimeException(propertyName + " is not defined in property file");
			}
		}
		//Exception is handled if property file is not found
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
