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
}
