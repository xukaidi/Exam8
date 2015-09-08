package com.hand.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.Address;

import com.hand.jdbc.ConnectionFactory;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{

	private String firstname;
	private String lastname;
	private String email;
	private int  address_id;
	
	public String add(){
		
		
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		
		PreparedStatement ps;
		try {
			System.out.println(address_id);
			ps = conn
					.prepareCall("INSERT INTO customer(first_name,last_name,email,address_id,store_id,create_date)VALUES(?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setInt(4,address_id);
			ps.setInt(5,1);
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String str = sdf.format(date);
			ps.setString(6, str);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	
}
