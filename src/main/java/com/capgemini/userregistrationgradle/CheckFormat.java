package com.capgemini.userregistrationgradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	static void checkFirstName() {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(TakingInput.firstName());
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid first Name");
		else
			System.out.println("Invalid first Name");
	}

	static void checkLastName() {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(TakingInput.lastName());
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid last Name");
		else
			System.out.println("Invalid last Name");
	}

	static void checkEmail() {
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(TakingInput.email());
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
	}

	static void checkPhone() {
		Pattern pattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher matcher = pattern.matcher(TakingInput.phoneNo());
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Phone Number");
		else
			System.out.println("Invalid Phone Number");
	}

	static void checkPassword() {
		Pattern pattern = Pattern.compile("^\\\\S{8,}$");
		Matcher matcher = pattern.matcher(TakingInput.passWord());
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
}
