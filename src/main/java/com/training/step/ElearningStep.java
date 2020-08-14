package com.training.step;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.training.db.DBClient;
import com.training.factory.DriverFactory;
import com.training.factory.DriverNames;
import com.training.selenium.util.CaptureScreenShot;
import com.training.pom.ElearningPOM;
import com.training.selenium.util.Sleep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElearningStep {

	private ElearningPOM elearningPOM;
	private WebDriver driver;
	private CaptureScreenShot captureScreenShot;
	private DBClient db;

	public ElearningStep() {
		this.driver = DriverFactory.getDriver(DriverNames.CHROME);
		this.elearningPOM = new ElearningPOM(driver);
		this.captureScreenShot = new CaptureScreenShot(driver);
		this.db = new DBClient();
	}

	@Given("^the elearing application is loaded$")
	public void the_elearing_application_is_loaded() throws Throwable {
		// System.out.println("the elearing application is loaded.....");
		driver.get("http://elearningm1.upskills.in/");

	}

	@Given("^user go for sign-up registration$")
	public void user_go_for_sign_up_registration() throws Throwable {
		// System.out.println("user go for sign-up registration......");
		elearningPOM.clickSignUpBtn();
	}

	@When("^enters his firstname in firstname text box$")
	public void enters_his_in_firstname_text_box() throws Throwable {
		// System.out.println("enters his \\\"([^\\\"]*)\\\" in firstname text
		// box......");
		elearningPOM.sendFirstName(db.firstname);
	}

	@When("^enters his lastname in lastname text box$")
	public void enters_his_lastname_in_lastname_text_box() throws Throwable {
		// System.out.println("enters his \\\"([^\\\"]*)\\\" in lastname text
		// box......");
		elearningPOM.sendLastName(db.lastname);
	}

	@When("^enters his user_email in email text box$")
	public void enters_his_user_email_in_email_text_box() throws Throwable {
		// System.out.println("enters his \\\"([^\\\"]*)\\\" in email text box......");
		elearningPOM.sendUserEmail(db.user_email);
	}

	@When("^enters his username in username text box$")
	public void enters_his_username_in_username_text_box() throws Throwable {
		// System.out.println("enters his \\\"([^\\\"]*)\\\" in username text
		// box......");
		elearningPOM.sendUserName(db.username);
	}

	@When("^enters his password in  password textbox$")
	public void enters_his_password_in_password_textbox() throws Throwable {
		// System.out.println("enters his \\\"([^\\\"]*)\\\" in password
		// textbox......");
		elearningPOM.sendPassword(db.pwd);
	}

	@When("^enters  confirm_password in confirm-password textbox$")
	public void enters_confirm_password_in_confirm_password_textbox() throws Throwable {
		// System.out.println("enters \\\"([^\\\"]*)\\\" in confirm-password
		// textbox......");
		elearningPOM.sendConfirmPassword(db.confirm_pwd);
	}

	@Then("^user gets successfully registered message with his personal details$")
	public void user_gets_successfully_registered_message_with_his_personal_details() throws Throwable {
		// System.out.println("user gets successfully registered message with his
		// personal details......");
		elearningPOM.clickRegisterBtn();
	}

	@Then("^take a screenshot1$")
	public void take_a_screenshot1() throws Throwable {
		System.out.println("take a screenshot1......");
		captureScreenShot.screenShot();
	}

	@Then("^Click right corner dropdown to verify his details$")
	public void click_right_corner_dropdown_to_verify_his_details() throws Throwable {
		// System.out.println("Click right corner dropdown to verify his
		// details......");
		elearningPOM.clickDDToggle();
	}

	@Then("^take a screenshot2$")
	public void take_a_screenshot2() throws Throwable {
		System.out.println("take a screenshot2......");
		Sleep.sleepSeconds(10);
		captureScreenShot.screenShot();
	}

	// 2nd Scenario starts here

	/*
	 * @Given("^the login is successful to elearning homepage$") public void
	 * the_login_is_successful_to_elearning_homepage() throws Throwable {
	 * //System.out.println("the login is successful to elearning homepage......");
	 * }
	 */

	@Then("^user go for email compose from home page$")
	public void user_go_for_email_compose_from_home_page() throws Throwable {
		// System.out.println("user go for email compose from home page......");
		elearningPOM.clickHomePage();
		Sleep.sleepSeconds(10);
		elearningPOM.clickCompose();
	}

	// work from here to include code to press enter keys

	@Then("^enters other user to_email in send-to text box$")
	public void enters_other_user_to_email_in_send_to_text_box() throws Throwable {
		// System.out.println("enters other user \\\"([^\\\"]*)\\\" in send-to text
		// box......");
		elearningPOM.sendSendTo(db.to_email);
	}

	@When("^enters email \"([^\"]*)\" in email-subject text box$")
	public void enters_email_in_email_subject_text_box(String emailsubject) throws Throwable {

	}

	@Then("^enters email message_subject in email-subject text box$")
	public void enters_email_message_subject_in_email_subject_text_box() throws Throwable {
		// System.out.println("enters email \\\"([^\\\"]*)\\\" in email-subject text
		// box......");
		elearningPOM.sendSubject(db.msg_subject);
	}

	@Then("^enters message_content in message-body text box$")
	public void enters_message_content_in_message_body_text_box() throws Throwable {
		elearningPOM.composeMessage(db.msg_content);
		Sleep.sleepSeconds(30);
	}

	@When("^clicks on send-message button$")
	public void clicks_on_send_message_button() throws Throwable {
		// System.out.println("clicks on send-message button......");
		elearningPOM.clickSendMessage();
	}

	@Then("^acknowledgement message page is shown$")
	public void acknowledgement_message_page_is_shown() throws Throwable {
		System.out.println("acknowledgement message page is shown......");
		elearningPOM.validateMsgAck();
	}

	@Then("^take a screenshot3$")
	public void take_a_screenshot3() throws Throwable {
		System.out.println("take a screenshot3......");
		captureScreenShot.screenShot();
	}
	
	@Then("^close all sessions$")
	public void close_all_sessions() throws Throwable {
		System.out.println("close all sessions......");
		elearningPOM.closeSessions();
	}
	
	

}
