package com.feicui.atm;
import java.util.Scanner;

public class Transfer{

	
	
	private double number ;
	private String accountid;
	private int i;

	public void getTransfer(int i,User[] user){
			double number;

		while(true){
			System.out.println("�������˻�");
			Scanner input = new Scanner(System.in);
			String accountid = input.next();
			
			Login login = new Login();
			String acount = String.valueOf(accountid.length());	
			if(login.checkAccount(acount)){
				if(existUser(user,accountid)){
					if(!user[i].isequals(user[this.i])){
						break;
					}else{
						System.out.println("���ܸ��Լ�ת��");
						continue;
					}
				}else{
					System.out.println("�˺Ų�����");
				}
						
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
			if(num>0&&num<=user[i].getAmount()){
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
				System.out.println("�Է��˻�"+user[this.i].getUser());
				System.out.println(user[this.i].getName());
				System.out.println("ת�˽��"+number);
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
				System.out.println("�����������������");
				continue;
			}			
		}	
	}	
	
	public void confirmTransfer(int i,User[] user){       
		while(true){
			System.out.println("1.ȷ��");		
			System.out.println("2.������һ��");
			System.out.println("3.�˿�");
			Scanner input = new Scanner(System.in);
			String num2=input.next();
			if(num2.equals("1")){				
				user[i].setAmount(user[i].getAmount()-this.number);
				user[this.i].setAmount(user[this.i].getAmount()+this.number);
				System.out.println("��ǰ���Ϊ"+user[i].getAmount());
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
				System.out.println("�����������������");
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