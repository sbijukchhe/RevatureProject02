package com.revature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
	
	@Id
	@Column(name="U_USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	
	@Column(name="U_FIRST_NAME")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	String firstName;
	
	@Column(name="U_LAST_NAME")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	String lastName;
	
	@Column(name="U_USERNAME")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	String userName;
	
	@Column(name="U_PASSWORD")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	String password;
	
	@Column(name="POST_ID")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	int postId;

	public Users() {
		super();
	}

	public Users(int userId, String firstName, String lastName, String userName, String password, int postId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", postId=" + postId + "]";
	}

	
	

}
