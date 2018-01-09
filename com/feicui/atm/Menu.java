package com.feicui.atm;
import java.util.Scanner;

public class Menu{
	
	private User user ;
	public Menu(User user){
		this.user =user;
	}
	public void getMethod(){
		
		
		while(true){
			System.out.println("1.Query");
			System.out.println("2.Transfer");
			System.out.println("3.Cash");
			System.out.println("4.Deposit");
			System.out.println("5.Sign out");
			Scanner input = new Scanner(System.in);
			String num=input.next();
			if(num.equals("1")){
				Query query = new Query(user);
				query.getQuery();
			}
			if(num.equals("2")){
				Transfer transfer = new Transfer(user);
				transfer.getTransfer();
			}
			if(num.equals("3")){
				Cash cash = new Cash(user);
				cash.getCash();
			}
			if(num.equals("4")){
				Deposit deposit = new Deposit(user);
				deposit.getDeposit();
			}
			if(num.equals("5")){
				Login login = new Login(user);
				login.loginIn();
			}
			else{
				System.out.println("error input");
				continue;
			}			
		}
	}	
}