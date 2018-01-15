package com.feicui.atm;
import java.util.Scanner;

public abstract class AtmAbstract(){
	Scanner input = new Scanner(System.in);

	public abstract void Action(User[] user);
}