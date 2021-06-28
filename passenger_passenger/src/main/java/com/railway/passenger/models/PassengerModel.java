package com.railway.passenger.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("passenger")
public class PassengerModel {
	@Id
	private String id;
	@Field
	private String user_id;
	@Field
	private String name;
	@Field
	private String email;
	@Field
	private String age;
	@Field
	private String gender;
	@Field
	private String location;
	@Field
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PassengerModel(String id, String user_id, String name, String email, String age, String gender,
			String location, String password) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.password = password;
	}
	public PassengerModel() {
	}
	@Override
	public String toString() {
		return "PassengerModel [id=" + id + ", user_id=" + user_id + ", name=" + name + ", email=" + email + ", age="
				+ age + ", gender=" + gender + ", location=" + location + ", password=" + password + "]";
	}
	
	
	
	

}
