package com.training.selenium.util;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	private WebDriver driver; 
	
	public CaptureScreenShot(WebDriver driver) {
		 this.driver = driver; 
	}
	
	
	public void screenShot() {
		String path="C:\\Guna\\workspace\\eclipse-workspace\\ASEoD-mS-Robot\\selenium-cucumber-project3-13-08\\ScreenShots\\";
		String fileName=""; 
		
		// file name as date-Hrs-secs
		
		GregorianCalendar calendar = new GregorianCalendar(); 
		
		int date = calendar.get(Calendar.DATE);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		fileName =  Integer.valueOf(date).toString() +"-" + 
				 Integer.valueOf(minute).toString() + "-" + 
				 Integer.valueOf(second).toString() +".png";
		
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver; 
		
		File file = takeScreenShot.getScreenshotAs(OutputType.FILE); 
		
		try {
			FileUtils.copyFile(file, new File(path + fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void screenShot(String fileName) {
		String path="/Volumes/Kanchan/MyTrainings/selenium-cucumber-ibm-manipal/screen-shots/"; 
	 
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver; 
		
		File file = takeScreenShot.getScreenshotAs(OutputType.FILE); 
		
		try {
			FileUtils.copyFile(file, new File(path + fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
