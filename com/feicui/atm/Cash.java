package com.feicui.atm;
import java.util.Scanner;

public class Cash{
	
	private User user ;
	public Cash(User user){
		this.user =user;
	}
	
	public void getCash(){
	double number;

		while(true){
			System.out.println("请输入取款金额(请输入100的倍数)");
			Scanner input = new Scanner(System.in);
			double num = input.nextDouble();
			//Account account = new Account();
			double num1=user.getAmount();
			if(num%100==0&&num>0){
				if(num1>num){
					number=num;
					break;	
				}
				else{
					System.out.println("余额不足，请重新输入");
				}
					
			}
			else{
				System.out.println("输入错误，请重新输入");
			}			
				
		}	
		
		while(true){
			System.out.println("1.确认");		
			System.out.println("2.重新输入");
			System.out.println("3.返回菜单");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				
				double amount=user.getAmount();
				user.setAmount(amount-number);
				System.out.println("取款成功，现在的余额为"+user.getAmount());
				Success success = new Success(user);
				success.getSuccess();
			}
			if(num2.equals("2")){
				getCash();
			}
			if(num2.equals("3")){
				Menu menu = new Menu(user);
				menu.getMethod();
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}	
	}	
}