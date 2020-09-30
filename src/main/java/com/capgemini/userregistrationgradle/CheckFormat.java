package com.capgemini.userregistrationgradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	public static boolean checkFirstName(String firstName) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid first Name");
		else {
			System.out.println("Invalid first Name");
			throw new UserRegistrationException("Please enter proper fname");
		}
		return matchFound;
	}

	public static boolean checkLastName(String lastName) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid last Name");
		else
			throw new UserRegistrationException("Please enter proper lastname");
		return matchFound;
	}

	public static boolean checkEmail(String email) throws UserRegistrationException {
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$");
		Matcher matcher = pattern.matcher(email);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Email");
		else
			throw new UserRegistrationException("Please enter proper email");
		return matchFound;
	}

	public static boolean checkPhone(String phoneNo) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^91\\s[0-9]{10}$");
		Matcher matcher = pattern.matcher(phoneNo);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Phone Number");
		else
			throw new UserRegistrationException("Please enter proper mobile no");
		return matchFound;
	}

	public static boolean checkPassword(String password) throws UserRegistrationException {
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid Password");
		else
			throw new UserRegistrationException("Please enter proper password");
		return matchFound;
	}
}
