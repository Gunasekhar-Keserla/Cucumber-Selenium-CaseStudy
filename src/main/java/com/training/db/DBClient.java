package com.training.db;

import java.sql.SQLException;
import java.util.List;

import com.training.beans.User;


public class DBClient {
	/*
	public static void main(String[] args) {
		UserDAO userDao = new UserDAO(); 
		
		// cmd/ctrl + 2 + l 
		List<User1> users = userDao.getUsers(); 
		
		for(User1 temp : users) {
			System.out.println(temp);
		}
	}
	*/
	
	
	UserDAO userDao = new UserDAO(); 
	User user = userDao.getUsers(); 
	
	public String firstname = user.getFirstName();
	public String lastname = user.getLastName();
	public String user_email = user.getUserEmail();
	public String username = user.getUserName();
	public String pwd = user.getPwd();	
	public String confirm_pwd = user.getConfirmPwd();
	public String to_email = user.getToEmail();
	public String msg_subject = user.getMsgSubject();
	public String msg_content = user.getMsgContent();	
	
	public void updateUserName() {
		userDao.updateUserName();
	}
	
	public void closecon() throws SQLException {
		GetConnection.closeCon();
	}
	
	public static void main(String[] args) {
		
		}
	
}
