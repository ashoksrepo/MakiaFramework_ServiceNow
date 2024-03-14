package com.framework.servicenow.tests.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.restassured.api.base.RESTAssuredBase;

import io.restassured.response.Response;

public class TC002_UpdateIncident_ConfigurationManager extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testcaseName = "Update Incident";
		testDescription = "Update Incident using REST API";
		authors = "Ashok";
		category = "REST";
		//dataProvider
		dataFileName = "TC002";
	    dataFileType = "JSON";
	}
 
	@Test(dataProvider = "fetchData", dependsOnMethods =  {"com.framework.servicenow.tests.rest.TC001_CreateIncident_ConfigurationManager.createIncident", "jsonSimple.jsonDataCreator.jsondata2"})
	public void updateIncident(File file) throws FileNotFoundException, IOException {
		
		Response response =  putWithFileBodyAndURL(file, ConfigurationManager.configuration().getIncident()+"/"+sys_id);
		response.prettyPrint();
		verifyResponseCode(response,ConfigurationManager.configuration().putStatuscode());
		
	}
  
}
