package com.training.beans;

public class User {
	
	private String firstName; 
	private String lastName;
	private String userEmail;
	private String userName;
	private String pwd;
	private String confirmPwd;
	private String toEmail;
	private String msgSubject;
	private String msgContent;
	

	
	
	
	
	public User(String firstName, String lastName, String userEmail, String userName, String pwd, String confirmPwd,
			String toEmail, String msgSubject, String msgContent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.userName = userName;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
		this.toEmail = toEmail;
		this.msgSubject = msgSubject;
		this.msgContent = msgContent;
	}




	public User() {}
	
	
	
	
	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getUserEmail() {
		return userEmail;
	}




	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	//*************
	
	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	
	
	}
	//******************
	




	public String getPwd() {
		return pwd;
	}




	public void setPwd(String pwd) {
		this.pwd = pwd;
	}




	public String getConfirmPwd() {
		return confirmPwd;
	}




	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}




	public String getToEmail() {
		return toEmail;
	}




	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}




	public String getMsgSubject() {
		return msgSubject;
	}




	public void setMsgSubject(String msgSubject) {
		this.msgSubject = msgSubject;
	}




	public String getMsgContent() {
		return msgContent;
	}




	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}




	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userEmail=" + userEmail + ", userName="
				+ userName + ", pwd=" + pwd + ", confirmPwd=" + confirmPwd + ", toEmail=" + toEmail + ", msgSubject="
				+ msgSubject + ", msgContent=" + msgContent + "]";
	}

	

	

}
