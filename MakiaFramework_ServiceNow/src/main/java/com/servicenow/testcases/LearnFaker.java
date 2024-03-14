package com.servicenow.testcases;

import org.testng.annotations.Test;

import com.framework.config.ConfigurationManager;
import com.framework.data.dynamic.FakerDataFactory;

public class LearnFaker {

	@Test
	public void faker() {
		System.out.println(FakerDataFactory.getFirstName());
		System.out.println(FakerDataFactory.getLastName());
		System.out.println(FakerDataFactory.getAddress());
		System.err.println(FakerDataFactory.getCity());

		System.err.println(FakerDataFactory.getCompanyName());
		System.err.println(FakerDataFactory.getShortDesc());
		System.err.println(FakerDataFactory.ipAddress());
		System.err.println(FakerDataFactory.fakevalue());
		System.err.println(FakerDataFactory.date());
	}
}
