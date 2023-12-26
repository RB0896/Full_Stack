package com.ot9.tests;

import java.util.Scanner;

public class SumnAvg {

	public static void main(String[] args) {
		System.out.println("Give all 5 numbers");
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		int secondNum=scan.nextInt();
		int thirdNum=scan.nextInt();
		int fourthNum= scan.nextInt();
		int fifthNum=scan.nextInt();
		int sum = firstNum+secondNum+thirdNum+fourthNum+fifthNum;
		System.out.println("The sum of all 5 numbers is : "+sum);
		int ave=sum/5;
		System.out.println("The ave of all 5 numbers is : "+ave);
		scan.close();
		
		
	}

}
