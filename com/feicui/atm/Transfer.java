package com.feicui.atm;
import java.util.Scanner;

public class Transfer{

	
	
	private double number ;
	private String accountid;
	private int i;

	public void getTransfer(int i,User[] user){
			double number;

		while(true){
			System.out.println("请输入账户");
			Scanner input = new Scanner(System.in);
			String accountid = input.next();
			
			Login login = new Login();
			String acount = String.valueOf(accountid.length());	
			if(login.checkAccount(acount)){
				if(existUser(user,accountid)){
					if(!user[i].isequals(user[this.i])){
						break;
					}else{
						System.out.println("不能给自己转帐");
						continue;
					}
				}else{
					System.out.println("账号不存在");
				}
						
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
			if(num>0&&num<=user[i].getAmount()){
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
				System.out.println("对方账户"+user[this.i].getUser());
				System.out.println(user[this.i].getName());
				System.out.println("转账金额"+number);
				confirmTransfer(i,user);
			}
			if(num2.equals("2")){
				Menu menu = new Menu();
				menu.getMethod(i,user);
			}
			if(num2.equals("3")){
				Login login = new Login();
				login.loginIn(user);
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}	
	}	
	
	public void confirmTransfer(int i,User[] user){       
		while(true){
			System.out.println("1.确认");		
			System.out.println("2.返回上一步");
			System.out.println("3.退卡");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){				
				user[i].setAmount(user[i].getAmount()-this.number);
				user[this.i].setAmount(user[this.i].getAmount()+this.number);
				System.out.println("当前余额为"+user[i].getAmount());
				Success success = new Success();
				success.getSuccess(i,user);
			}
			if(num2.equals("2")){
				getTransfer(i,user);
			}
			if(num2.equals("3")){
				Login login = new Login();
				login.loginIn(user);
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}	
	}
	public boolean existUser(User[] user,String account){
		int i;
		for(i=0;i<user.length;i++){
			
			if(user[i].getUser().equals(account)){
				this.i=i;
				return true;
			}							
		}
				return false;
	}
}