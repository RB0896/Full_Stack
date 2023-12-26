package com.ot9.tests;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your three numbers");
		int firstNum=scan.nextInt();
		int secondNum=scan.nextInt();
		int thirdNum = scan.nextInt();
		if(firstNum>secondNum&&firstNum>thirdNum)
		{
		System.out.println(+firstNum +" is the greatest of two and three");
		}
		else if(secondNum>firstNum&&secondNum>thirdNum)
		{
	     System.out.println(+secondNum +" is the greatest of one and three");

		}
		else
		{
	     System.out.println(+thirdNum +" is the greatest of one and two");

		}
	}



}
