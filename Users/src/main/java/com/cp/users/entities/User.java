package com.cp.users.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * User Entity Class It will keep all the details of User
 * 
 * @author hritwick
 *
 */
@Entity
@Table(name = "users")
public class User {

//	variables
	@Id
	@GeneratedValue
	@NotNull(message = "User Id can not be Null")
	private int userid;
	@NotEmpty(message = "User Name can not be null")
	private String userName;
	@NotEmpty(message = "Email can not be null")
	private String userEmail;
	private int userAge;
	private double userRating = 0;

//	Field Constructor

	public User(@NotNull(message = "User Id can not be Null") int userid,
			@NotEmpty(message = "User Name can not be null") String userName,
			@NotEmpty(message = "Email can not be null") String userEmail, int userAge, double userRating) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userAge = userAge;
		this.userRating = userRating;
	}

//	getters and setters
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public double getUserRating() {
		return userRating;
	}

	public void setUserRating(double userRating) {
		this.userRating = userRating;
	}

	// Default Constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Overriding toString method
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userEmail=" + userEmail + ", userAge=" + userAge
				+ ", userRating=" + userRating + "]";
	}

	
	
}
