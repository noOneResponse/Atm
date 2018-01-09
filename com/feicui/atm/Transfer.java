package com.feicui.atm;
import java.util.Scanner;

public class Transfer{

	private User user ;
	public Transfer(User user){
		this.user =user;
	}
	private double number ;
	private String accountid;

	public void getTransfer(){
			double number;

		while(true){
			System.out.println("请输入账户");
			Scanner input = new Scanner(System.in);
			String accountid = input.next();
			if(accountid.length()==12){
				this.accountid=accountid;
				break;		
			}
			else{
				System.out.println("账户格式不正确，请重新输入");
				continue;
			}	

		}	
		while(true){
			System.out.println("请输入金额");
			Scanner input = new Scanner(System.in);
			double num = input.nextDouble();
			if(num>0&&num<=user.getAmount()){
				number=num;
				this.number=number;
				break;		
			}
			else{
				System.out.println("余额不足");
				continue;
			}	

		}	
		
		while(true){
			System.out.println("1.确认");		
			System.out.println("2.返回菜单");
			System.out.println("3.退卡");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				System.out.println("对方账户"+this.accountid);
				System.out.println("对方帐户名");
				System.out.println("转账金额"+number);
				confirmTransfer();
			}
			if(num2.equals("2")){
				getTransfer();
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
	
	public void confirmTransfer(){       
		while(true){
			System.out.println("1.确认");		
			System.out.println("2.返回上一步");
			System.out.println("3.退卡");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				//Account account = new Account();
				double amount=user.getAmount();
				user.setAmount(amount-this.number);
				System.out.println("当前余额为"+user.getAmount());
				Success success = new Success(user);
				success.getSuccess();
			}
			if(num2.equals("2")){
				getTransfer();
			}
			if(num2.equals("3")){
				Login login = new Login(user);
				login.loginIn();
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}	
	}
}