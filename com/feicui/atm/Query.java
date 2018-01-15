package com.feicui.atm;
import java.util.Scanner;


public class Query{
	

	
	public void getQuery(int i,User[] user){
		
		
		while(true){		
			System.out.println(user[i].getName());
			System.out.println(user[i].getAmount());
			System.out.println("1.返回上一级");
			Scanner input = new Scanner(System.in);
			String num = input.next();
			if(num.equals("1")){
				backMenu(i,user);
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}
	}
	
	public void backMenu(int i,User[] user){
		Menu menu = new Menu();
		menu.getMethod(i,user);
	}
}