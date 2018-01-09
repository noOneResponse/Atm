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
			System.out.println("�������˻�");
			Scanner input = new Scanner(System.in);
			String accountid = input.next();
			if(accountid.length()==12){
				this.accountid=accountid;
				break;		
			}
			else{
				System.out.println("�˻���ʽ����ȷ������������");
				continue;
			}	

		}	
		while(true){
			System.out.println("��������");
			Scanner input = new Scanner(System.in);
			double num = input.nextDouble();
			if(num>0&&num<=user.getAmount()){
				number=num;
				this.number=number;
				break;		
			}
			else{
				System.out.println("����");
				continue;
			}	

		}	
		
		while(true){
			System.out.println("1.ȷ��");		
			System.out.println("2.���ز˵�");
			System.out.println("3.�˿�");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				System.out.println("�Է��˻�"+this.accountid);
				System.out.println("�Է��ʻ���");
				System.out.println("ת�˽��"+number);
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
				System.out.println("�����������������");
				continue;
			}			
		}	
	}	
	
	public void confirmTransfer(){       
		while(true){
			System.out.println("1.ȷ��");		
			System.out.println("2.������һ��");
			System.out.println("3.�˿�");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){
				//Account account = new Account();
				double amount=user.getAmount();
				user.setAmount(amount-this.number);
				System.out.println("��ǰ���Ϊ"+user.getAmount());
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
				System.out.println("�����������������");
				continue;
			}			
		}	
	}
}