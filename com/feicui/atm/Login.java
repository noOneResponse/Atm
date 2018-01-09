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
						
			System.out.println("请输入账户");
			String account = input.next();
								
			if(account.length()==12){
				
				if(account.equals("370120180104")||account.equals("370120180108")){
					
					while(true){
						System.out.println("请输入密码");
						String password = input.next();
						if(account.equals("370120180104")&&password.equals("123456")){
							System.out.println("登陆成功");
							user.setName("翡翠侠");
							user.setUser("370120180104");
							user.setPassword("123456");
							user.setAmount(1000);
							break;
						}
						else if(account.equals("370120180108")&&password.equals("123456")){
							System.out.println("请输入密码");
							user.setName("爱国者");
							user.setUser("370120180108");
							user.setPassword("123456");
							user.setAmount(1000);
							break;
						}
						else {
							System.out.println("密码输入错误，请重新输入");
							continue;
						}					
					}					
				}
				else{
					System.out.println("账号不存在，请重新输入");
					continue;	
				}											
			}
			else{
				System.out.println("账号格式不正确，请重新输入");	
				continue;
			
			}
			Menu menu = new Menu(user);
			menu.getMethod();	
		}	
	}
}