package com.capgemini.userregistrationgradle;

import java.util.Scanner;

public class TakingInput {
	private static String firstName;
	static Scanner scan = new Scanner(System.in);

	static String firstName() {
		System.out.println("Enter Your First name");
		firstName = scan.nextLine();
		return firstName;
	}

	static String lastName() {
		System.out.println("Enter Your last name");
		String lastName;
		lastName = scan.nextLine();
		return lastName;
	}

	static String email() {
		System.out.println("Enter Your Email address");
		String email;
		email = scan.nextLine();
		return email;
	}

	static String phoneNo() {
		System.out.println("Enter Your Mobile Number");
		String phone;
		phone = scan.nextLine();
		return phone;
	}

	static String passWord() {
		System.out.println("Enter Your Password");
		String password;
		password = scan.nextLine();
		return password;
	}
}
