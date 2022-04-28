package com.app.controller;

import java.util.ArrayList;

public class Data {

	private boolean is_success=true;
	private String user_Id = "john_doe_17091999";
	private String email = "john@xyz.com";
	private String roll_number = "ABCD123";
	private ArrayList<Integer> numbers;
	private ArrayList<String> alphabates;
	
	
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}
	public void setNumbers(ArrayList<Integer> numbers) {
		this.numbers = numbers;
	}
	public ArrayList<String> getAlphabates() {
		return alphabates;
	}
	public void setAlphabates(ArrayList<String> alphabates) {
		this.alphabates = alphabates;
	}
	public boolean isIs_success() {
		return is_success;
	}
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	
	
	
}
