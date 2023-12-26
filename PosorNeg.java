package com.ot9.tests;

import java.util.Scanner;

public class PosorNeg {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		if(number>0)
		{
			System.out.println("your number is postive");
		}
		else
		{
			System.out.println("Your number is negative");
		}
		scan.close();
		
	}

}
