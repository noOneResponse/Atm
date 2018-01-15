package com.feicui.atm;
import java.util.Scanner;

public class Success{


	
	public void getSuccess(int i,User[] user){
		System.out.println("操作成功(输入任意值返回菜单)");
		Scanner input = new Scanner(System.in);
		String inp = input.next();
		if(inp.equals("q")){
			Menu menu = new Menu();
				menu.getMethod(i,user);
		}
		else{
			Menu menu = new Menu();
				menu.getMethod(i,user);
		}
	}
}