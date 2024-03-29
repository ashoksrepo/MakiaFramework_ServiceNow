package com.framework.servicenow.tests.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.restassured.api.base.RESTAssuredBase;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class TC001_CreateIncident_ConfigurationManager extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testcaseName = "Create Incident";
		testDescription = "Create Incident using REST API";
		authors = "Shan";
		category = "REST";
		//dataProvider
		dataFileName = "TC001";
	    dataFileType = "JSON";
	}
 
	@Test(dataProvider = "fetchData",dependsOnMethods = "jsonSimple.jsonDataCreator.jsondata1")
	public void createIncident(File file) throws FileNotFoundException, IOException {
		
		Response response = postWithBodyAsFileAndUrl(file, ConfigurationManager.configuration().getIncident());
		response.prettyPrint();
		verifyResponseCode(response,ConfigurationManager.configuration().postStatuscode());
		sys_id = extractResponseContent(response, "result.sys_id");
		
	}
  
		
		
	}























