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
			System.out.println("������ȡ����(������100�ı���)");
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
					System.out.println("���㣬����������");
				}
					
			}
			else{
				System.out.println("�����������������");
			}			
				
		}	
		
		while(true){
			System.out.println("1.ȷ��");		
			System.out.println("2.��������");
			System.out.println("3.���ز˵�");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				
				double amount=user.getAmount();
				user.setAmount(amount-number);
				System.out.println("ȡ��ɹ������ڵ����Ϊ"+user.getAmount());
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
				System.out.println("�����������������");
				continue;
			}			
		}	
	}	
}