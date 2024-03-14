package com.servicenow.testcases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.selenium.servicenow.pages.Loginpage;
import com.framework.testng.api.base.BaseMethods;
import com.github.javafaker.service.FakeValues;


public class TC_001Create_Incident extends BaseMethods{
	@BeforeTest
	public void setfileName() {
		excelFileName="CreateIncident";
		testcaseName="CreateIncident";
		testDescription ="Test data with mandatory Field";
		authors="Hari";
		category="Funtional";
	
	}
	
	
	@Test//(dataProvider="fetchData")
	public void runCreateIncident() throws IOException, InterruptedException {
		new Loginpage()
		.enterCredentials()
		.clickAll()
		.clickIncident()
		.clickNewOption()
		.getIncidentNum()
		.enterShortDescription()
		.clickSubmitButton()
		.getTheIncident();
		
		

}
}
