package com.training.pom;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.training.db.DBClient;
import com.training.selenium.util.Sleep;

public class ElearningPOM {

	private WebDriver driver;
	private DBClient db;

	public ElearningPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.db = new DBClient();
	}
	
	@FindBy(linkText="Sign up!")
	private WebElement signUp;
	
	@FindBy(id = "registration_firstname")
	private WebElement firstName;
	
	@FindBy(id = "registration_lastname")
	private WebElement lastName; 
		
	
	@FindBy(id = "registration_email")
	private WebElement userEmail;
	
	@FindBy(id = "username")
	private WebElement userName;
		
	@FindBy(id = "pass1")
	private WebElement password;
	
	
	@FindBy(id = "pass2")
	private WebElement confirmPassword;	
	
	
	@FindBy(id = "registration_submit")
	private WebElement register;	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement ddToggle;
	
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement homePage;
	
	@FindBy(xpath="//a[contains(text(),'Compose')]")
	private WebElement compose;	
		
	@FindBy(xpath="//input[@placeholder='Please select an option']")
	private WebElement sendTo;
	

	@FindBy(id="compose_message_title")
	private WebElement subject;
	
	/*
	driver.switchTo().frame(0); 
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]")
	private WebElement message;
	
	
	this.driver.switchTo().frame(0);        
	driver.findElement(By.xpath("/html/body")).sendKeys("Hello  Naveen \n" + "    This is for testing \n" + "\n" + "From,"+ "\n"+ "Deepa");
	@FindBy(xpath="/html/body")
	       Thread.sleep(4000);
	       
	*/   
	
	@FindBy(xpath="/html/body") 
	private WebElement msgBody; 
	
	@FindBy(id = "compose_message_compose")
	private WebElement sendMessage;
	
	
	public void clickSignUpBtn() {
		this.signUp.click(); 
	}
	
	
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}	
	
	
	public void sendUserEmail(String userEmail) {
		this.userEmail.clear();
		this.userEmail.sendKeys(userEmail);
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
		
	public void clickRegisterBtn() {
		this.register.click(); 
	}
	
	public void clickDDToggle() {
		this.ddToggle.click(); 
	}
	
	public void clickHomePage() {
		this.homePage.click(); 
	}
	
	public void clickCompose() {
		this.compose.click(); 
	}
	
	
	public void sendSendTo(String sendTo) {
		this.sendTo.clear();
		this.sendTo.sendKeys(sendTo);
		Sleep.sleepSeconds(10);
		this.sendTo.sendKeys(Keys.ENTER);
		
	}
	
	public void sendSubject(String subject) {
		this.subject.clear();
		this.subject.sendKeys(subject);
	}
	
	/*
	public void sendMessage(String message) {
		this.message.sendKeys(message);
	}
	*/
	
	public void composeMessage(String msgBody) { 
		Sleep.sleepSeconds(6); 
		driver.switchTo().frame(0); 
		this.msgBody.clear(); 
		this.msgBody.sendKeys(msgBody); 
		driver.switchTo().parentFrame(); 
	}  
	
	public void clickSendMessage() {
		this.sendMessage.click(); 
	}	
	
	public void validateMsgAck() throws SQLException {
		Sleep.sleepSeconds(5);
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'The message has been sent to')]"));
		Assert.assertTrue(list.size() > 0,"Text not found!");
		//db.updateUserSignup(db.username);
		//driver.quit();
		//db.closecon();
	}
	
	public void closeSessions() throws SQLException {
		Sleep.sleepSeconds(5);	
		db.updateUserName();
		driver.quit();
		db.closecon();
	}
	
	
}
