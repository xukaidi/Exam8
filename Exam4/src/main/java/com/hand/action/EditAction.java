package com.hand.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class EditAction extends ActionSupport {

	private String firstname, lastname, email;
	private int eid;
	private int address_id;


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

	public String update()  {
		System.out.println("update");
		Connection conn = com.hand.jdbc.ConnectionFactory.getInstance().getConnection();
		String upSql = "UPDATE customer SET first_name = ?,last_name=?,email=?,address_id=? WHERE customer_id=?";
		System.out.println(eid);
		System.out.println(upSql);
		try {
			PreparedStatement ps = conn.prepareStatement(upSql);
		
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, email);
			ps.setInt(4, address_id);
			ps.setInt(5, eid);
			System.out.println(ps.toString());
			ps.execute();
			return SUCCESS;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return SUCCESS;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}

}
