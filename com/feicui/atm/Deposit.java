package com.feicui.atm;
import java.util.Scanner;

public class Deposit{
	
	private User user ;
	public Deposit(User user){
		this.user =user;
	}
	
	public void getDeposit(){
	double number;

		while(true){
			System.out.println("����������(100Ԫ�ı���):");
			Scanner input = new Scanner(System.in);
			double num = input.nextDouble();
			if(num%100==0&&num>0){
				number=num;
				break;		
			}
			else{
				System.out.println("�����������������");
				continue;
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
				user.setAmount(amount+number);
				System.out.println("���ɹ������ڵ����Ϊ"+user.getAmount());
				Success success = new Success(user);
				success.getSuccess();
			}
			if(num2.equals("2")){
				getDeposit();
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