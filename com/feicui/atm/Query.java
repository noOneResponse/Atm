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
			System.out.println("1.������һ��");
			Scanner input = new Scanner(System.in);
			String num = input.next();
			if(num.equals("1")){
				backMenu();
			}
			else{
				System.out.println("�����������������");
				continue;
			}			
		}
	}
	
	public void backMenu(){
		Menu menu = new Menu(user);
		menu.getMethod();
	}
}