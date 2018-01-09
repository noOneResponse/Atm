package com.feicui.atm;
import java.util.Scanner;

public class Success{

	private User user ;
	public Success(User user){
		this.user =user;
	}
	
	public void getSuccess(){
		System.out.println("操作成功(输入任意值返回菜单)");
		Scanner input = new Scanner(System.in);
		String inp = input.next();
		if(inp.equals("q")){
			Menu menu = new Menu(user);
				menu.getMethod();
		}
		else{
			Menu menu = new Menu(user);
				menu.getMethod();
		}
	}
}