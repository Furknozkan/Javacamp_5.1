package Ödev5.entities.concretes;

import Ödev5.entities.abstracts.Entity;

public class User implements Entity{
	private String Firstname;
	private String LastName;
	private String password;
	private String Email;
	
	public User() {}
	
	
	public User(String firstname, String lastName, String password, String email) {
		super();
		Firstname = firstname;
		LastName = lastName;
		this.password = password;
		Email = email;
	}




	public String getFirstname() {
		return Firstname;
	}




	public void setFirstname(String firstname) {
		Firstname = firstname;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}




	public String getPassword() {
		return password;
	}




	public void setPaswsord(String password) {
		this.password = password;
	}




	public String getEmail() {
		return Email;
	}




	public void setEmail(String email) {
		Email = email;
	}
	
	

}
