package com.feicui.atm;

public class User{
	private String user;
	private String password;
	private String name;
	private double amount;
	public User(String user,String password,String name){
		this.user = user;
		this.password = password;
		this.name = name;
		this.amount = 1000;
	}
	public User(String user,String password){
	 	this.user=user;
		this.password=password;
	}
	public User(){
		
	}
	public String getUser(){
		return this.user;
	}
	public String getPassword(){
		return this.password;
	}
	public String getName(){
		return this.name;
	}
	public double getAmount(){
		return this.amount;
	}
	public void setAmount(double money){
		this.amount=money;
	}
	public boolean isequals(User anotheruser){
		return anotheruser.getUser().equals(user);
	}
	
	
		
}