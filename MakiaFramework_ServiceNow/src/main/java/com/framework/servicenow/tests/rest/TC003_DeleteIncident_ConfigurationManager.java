package com.framework.servicenow.tests.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.restassured.api.base.RESTAssuredBase;

import io.restassured.response.Response;

public class TC003_DeleteIncident_ConfigurationManager extends RESTAssuredBase{
	@BeforeTest//Reporting
	public void setValues() {
		testcaseName = "Delete Incident";
		testDescription = "Delete Incident using REST API";
		authors = "Ashok";
		category = "REST";
		//dataProvider
		dataFileName = "TC002";
	    dataFileType = "JSON";
	}
 
	@Test(/*dataProvider = "fetchData",*/ dependsOnMethods = "com.framework.servicenow.tests.rest.TC002_UpdateIncident_ConfigurationManager.updateIncident")
	public void deleteIncident() throws FileNotFoundException, IOException {
		
		Response response =  delete(ConfigurationManager.configuration().getIncident()+"/"+sys_id);
		verifyResponseCode(response,ConfigurationManager.configuration().deleteStatusCode());
		
	}
  
}

