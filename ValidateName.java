package com.ot9.execptionsassignments;

import java.util.Scanner;

class InvalidException extends Throwable{
	InvalidException(String message) {
		super(message);
	}
}

public class ValidateName {

	public static void main(String[] args) throws  InvalidException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName = scan.nextLine();
		System.out.println("Enter your last name ");
		String lastName = scan.nextLine();

		if (firstName == null || lastName == null) {
			throw new InvalidException("Invalid input");
		} else {
			System.out.println("Your full name is " + (firstName + lastName));
		}
		scan.close();
	}

}
