package com.feicui.atm;

public class User{
	private String user;
	private String password;
	private String name;
	private double amount=1000;
	public String getUser(){
		return this.user;
	}
	public void setUser(String user){
		this.user=user;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getAmount(){
		return this.amount;
	}
	public void setAmount(double money){
		this.amount=money;
	}
	
}