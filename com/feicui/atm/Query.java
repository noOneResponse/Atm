package com.feicui.atm;
import java.util.Scanner;


public class Query{
	

	
	public void getQuery(int i,User[] user){
		
		
		while(true){		
			System.out.println(user[i].getName());
			System.out.println(user[i].getAmount());
			System.out.println("1.������һ��");
			Scanner input = new Scanner(System.in);
			String num = input.next();
			if(num.equals("1")){
				backMenu(i,user);
			}
			else{
				System.out.println("�����������������");
				continue;
			}			
		}
	}
	
	public void backMenu(int i,User[] user){
		Menu menu = new Menu();
		menu.getMethod(i,user);
	}
}