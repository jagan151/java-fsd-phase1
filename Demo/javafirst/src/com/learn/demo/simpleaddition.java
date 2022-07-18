package com.learn.demo;
import java.util.Scanner;
public class simpleaddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("enter first number");
		num1=sc.nextInt();
		System.out.println("enter second number");
		num2=sc.nextInt();
		int result = num1+num2;
		System.out.println("addition is:"+result);
	}
	
}
