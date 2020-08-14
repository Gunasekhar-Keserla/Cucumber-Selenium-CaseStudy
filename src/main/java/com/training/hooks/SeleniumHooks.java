package com.training.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SeleniumHooks {

	@Before
	public void setUp() {
		System.out.println("any generic setup ");
	}

	@After
	public void tearDown() {
		System.out.println("Any generic tear down ");
	}
}
