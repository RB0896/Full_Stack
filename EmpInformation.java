package com.ot9.tests;

import java.util.Scanner;

public class EmpInformation {

	public static void main(String[] args) {
		// employee id, employee name, employee salary, employee address ,employee
		// contact, employee gender(char)
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your employee information");

		byte empId = scan.nextByte();
		String empName = scan.nextLine();
		float empSal = scan.nextFloat();
		String empAdd = scan.nextLine();
		long empCont = scan.nextLong();
		char empGen = scan.next().charAt(0);
		System.out.println("Your employee information is : " + empId + " " + empName + " " + empSal + " " + empAdd + " "
				+ empCont + " " + empGen);
		scan.close();
	}

}
