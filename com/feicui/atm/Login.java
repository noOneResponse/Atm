package com.feicui.atm;
import java.util.Scanner;

public class Login{
	private int i = 0;	
	
	public void loginIn(User[] user) {		
		 
		Scanner input = new Scanner(System.in);
		
		while(true){
						
			System.out.println("�������˻�");
			String account = input.next();
			String acount = String.valueOf(account.length());	
			
			if(checkAccount(acount)){
				if(existUser(user,account)){
					
					while(true){
						System.out.println("����������");
						String password = input.next();
						if(existPassword(user,password)){
						
							break;
						}
						else{
							System.out.println("���������������������");
							continue;
						}
					}
				}
				else {
					System.out.println("�˺Ų����ڣ�����������");	
				}
				
			}
			else{
				System.out.println("�˺Ÿ�ʽ����ȷ������������");	
				continue;
			}
			
		Menu menu = new Menu();
		menu.getMethod(this.i,user);
		}	
			
	}
	public boolean checkAccount(String account) {
		
		return account.matches("[0-9]{1,3}");
			
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
	public boolean existPassword(User[] user,String password){
		if(user[this.i].getPassword().equals(password)){
			return true;
		}
			return false;
								
		
	}
}


