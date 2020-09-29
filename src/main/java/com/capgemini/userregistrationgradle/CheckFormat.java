package com.capgemini.userregistrationgradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	public static boolean checkFirstName(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid first Name");
		else
			System.out.println("Invalid first Name");
		return matchFound;
	}

	public static boolean checkLastName(String lastName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid last Name");
		else
			System.out.println("Invalid last Name");
		return matchFound;
	}

	public static boolean checkEmail(String email) {
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		return matchFound;
	}

	public static boolean checkPhone(String phoneNo) {
		Pattern pattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Phone Number");
		else
			System.out.println("Invalid Phone Number");
		return matchFound;
	}

	public static boolean checkPassword(String password) {
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		return matchFound;
	}
}
