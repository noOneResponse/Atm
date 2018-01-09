package com.feicui.atm;
import java.util.Scanner;


public class Query{
	
	private User user ;
	public Query(User user){
		this.user =user;
	}
	
	public void getQuery(){
		
		
		while(true){		
			System.out.println(user.getName());
			System.out.println(user.getAmount());
			System.out.println("1.返回上一级");
			Scanner input = new Scanner(System.in);
			String num = input.next();
			if(num.equals("1")){
				backMenu();
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}
	}
	
	public void backMenu(){
		Menu menu = new Menu(user);
		menu.getMethod();
	}
}