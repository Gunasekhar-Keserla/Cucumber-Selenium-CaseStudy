package com.training.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationDataproviderTest {
  @Test(dataProvider = "userData")
  public void myTest(String firstName, String lastName, String userEmail, String userName, String pwd, String confirmPwd,
			String toEmail, String msgSubject, String msgContent) {
	  System.out.println("your selenium code goes here");
	  
	  System.out.println("firstName: " + firstName);
	  System.out.println("lastName: " + lastName);
	  
  }
  //data provider is the method
  @DataProvider(name="userData")
  public Object[][] getMyData(){
	  return new Object[][] {
		  // your data from mysql has to be invoked here
		  {"Gunasekhar", "Keserla", "gunasekhar@gmail.com", "guna119", "secret1", "secret1", "naveen", "Hi For Testing", "Hello Mr. Guna, This is for testing. From Guna"},
		  {"Gunasekhar1", "Keserla1", "gunasekhar1@gmail.com", "guna1191", "secret12", "secret12", "naveen", "Hi For Testing", "Hello Mr. Guna, This is for testing. From Guna"}
		  
	  };
	  
  }
}
