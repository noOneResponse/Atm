package com.feicui.atm;
import java.util.Scanner;

public class Login{
		
	private User user ;
	public Login(User user){
		this.user =user;
	}
	
	public void loginIn() {		
		
		Scanner input = new Scanner(System.in);
		
		
		while(true){
						
			System.out.println("�������˻�");
			String account = input.next();
								
			if(account.length()==12){
				
				if(account.equals("370120180104")||account.equals("370120180108")){
					
					while(true){
						System.out.println("����������");
						String password = input.next();
						if(account.equals("370120180104")&&password.equals("123456")){
							System.out.println("��½�ɹ�");
							user.setName("�����");
							user.setUser("370120180104");
							user.setPassword("123456");
							user.setAmount(1000);
							break;
						}
						else if(account.equals("370120180108")&&password.equals("123456")){
							System.out.println("����������");
							user.setName("������");
							user.setUser("370120180108");
							user.setPassword("123456");
							user.setAmount(1000);
							break;
						}
						else {
							System.out.println("���������������������");
							continue;
						}					
					}					
				}
				else{
					System.out.println("�˺Ų����ڣ�����������");
					continue;	
				}											
			}
			else{
				System.out.println("�˺Ÿ�ʽ����ȷ������������");	
				continue;
			
			}
			Menu menu = new Menu(user);
			menu.getMethod();	
		}	
	}
}