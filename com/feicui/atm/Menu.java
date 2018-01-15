package com.feicui.atm;
import java.util.Scanner;

public class Menu {
	

	
	public void getMethod(int i,User[] user){
		
		
		while(true){
			System.out.println("1.Query");
			System.out.println("2.Transfer");
			System.out.println("3.Cash");
			System.out.println("4.Deposit");
			System.out.println("5.Sign out");
			Scanner input = new Scanner(System.in);
			String num=input.next();
			
			if(num.equals("1")){
				Query query= new Query();
				query.getQuery(i,user);
			}
			if(num.equals("2")){
				Transfer transfer = new Transfer();
				transfer.getTransfer(i,user);
			}
			if(num.equals("3")){
				Cash cash= new Cash();
				cash.getCash(i,user);
			}
			if(num.equals("4")){
				Deposit deposit= new Deposit();
				deposit.getDeposit(i,user);
			}
			if(num.equals("5")){
				Login login = new Login();
				login.loginIn(user);
			}
			else{
				System.out.println("error input");
				continue;
			}			
		
		}
	}	
}