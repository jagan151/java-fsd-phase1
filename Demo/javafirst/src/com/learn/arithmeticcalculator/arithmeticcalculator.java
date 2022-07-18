package com.learn.arithmeticcalculator;
import java.util.Scanner;
public class arithmeticcalculator {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("select the operator(+,-,*,/)");
		char operator = sc.next().charAt(0);
		double output=0;
		switch(operator) {
		case '+':
			output=n1+n2;
			break;
		case '-':
			output=n1-n2;
			break;
		case '*':
			output=n1*n2;
			break;
		case '/':
			output=n1/n2;
			break;
			default:
				System.out.println("entered wrong output");
				break;
		}
		System.out.println("result is: "+output);
	}

}
