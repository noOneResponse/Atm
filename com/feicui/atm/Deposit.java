package com.feicui.atm;
import java.util.Scanner;

public class Deposit{
	

	
	public void getDeposit(int i,User[] user){
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
				double amount=user[i].getAmount();
				user[i].setAmount(amount+number);
				System.out.println("���ɹ������ڵ����Ϊ"+user[i].getAmount());
				Success success = new Success();
				success.getSuccess(i,user);
			}
			if(num2.equals("2")){
				getDeposit(i,user);
			}
			if(num2.equals("3")){
				Menu menu = new Menu();
				menu.getMethod(i,user);
			}
			else{
				System.out.println("�����������������");
				continue;
			}			
		}	
	}	
}