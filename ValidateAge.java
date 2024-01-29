package com.ot9.execptionsassignments;

import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) throws ArithmeticException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age :");
		int age =scan.nextInt();
		if(age<15)
		{
			throw new ArithmeticException("Age should be more than 15");
		}
		else
		{
			System.out.println("Your validated age is "+age);
		}
		scan.close();
		
	}

}
