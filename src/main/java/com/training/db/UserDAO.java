package com.training.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.training.beans.User;


public class UserDAO {
	
	GetConnection gc = new GetConnection(); 
	Connection con = GetConnection.getMySQLConnection();

	public User getUsers(){
		String sql ="select firstname,lastname , user_email , username , pwd, confirm_pwd, to_email, msg_subject, msg_content from user_info1 LIMIT 1"; 
		
			
		List<User> users = new ArrayList<User>(); 
		User user = new User();
		
		try {
			gc.ps1 = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.rs = gc.ps1.executeQuery(); 
			
			while(gc.rs.next()) {
				
				user.setFirstName(gc.rs.getString("firstname")); 
				user.setLastName(gc.rs.getString("lastname")); 
				user.setUserEmail(gc.rs.getString("user_email")); 
				user.setUserName(gc.rs.getString("username"));
				user.setPwd(gc.rs.getString("pwd"));
				user.setConfirmPwd(gc.rs.getString("confirm_pwd"));
				user.setToEmail(gc.rs.getString("to_email"));
				user.setMsgSubject(gc.rs.getString("msg_subject"));
				user.setMsgContent(gc.rs.getString("msg_content"));				
				 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user; 
	}
	
	
	public void updateUserName() {
		Random rand = new Random();
		String id = String.format("%04d%n", rand.nextInt(10000));
		//String id = String.format("%04d", random.nextInt(10000));
		String sql = "update user_info1 set username='guna"+id+"'";
		System.out.println(sql);
		try {
			gc.ps2 = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.ps2.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
