package com.capgemini.userregistrationgradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	final static String NAME_PATTERN = "^([A-Z])[a-zA-Z]{2,}$";
	final static String EMAIL_PATTERN = "^([a-z]){1,}([.+_-]){0,1}[0-9a-z]+(@){1}([0-9a-z]*)(.([a-z]){2,}){1}(.[a-z][a-z])?$";
	final static String PHONE_PATTERN = "^91\\s[0-9]{10}$";
	final static String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$";

	public static boolean checkFirstName(String firstName) throws UserRegistrationException {
		IValidate validateFirstName = firstNameValid -> {
			return Pattern.compile(NAME_PATTERN).matcher(firstNameValid).find();
		};

		boolean matchFound = validateFirstName.valid(firstName);
		if (matchFound)
			System.out.println("Valid first Name");
		else {
			throw new UserRegistrationException("Please enter proper fname");
		}
		return matchFound;
	}

	public static boolean checkLastName(String lastName) throws UserRegistrationException {
		IValidate validateLastName = lastNameValid -> {
			return Pattern.compile(NAME_PATTERN).matcher(lastNameValid).find();
		};
		boolean matchFound = validateLastName.valid(lastName);
		if (matchFound)
			System.out.println("Valid last Name");
		else
			throw new UserRegistrationException("Please enter proper lastname");
		return matchFound;
	}

	public static boolean checkEmail(String email) throws UserRegistrationException {
		IValidate validateEmail = emailValid -> {
			return Pattern.compile(EMAIL_PATTERN).matcher(emailValid).find();
		};
		boolean matchFound = validateEmail.valid(email);
		if (matchFound)
			System.out.println("Valid Email");
		else
			throw new UserRegistrationException("Please enter proper email");
		return matchFound;
	}

	public static boolean checkPhone(String phoneNo) throws UserRegistrationException {
		IValidate validatePhoneNo = phoneValid -> {
			return Pattern.compile(PHONE_PATTERN).matcher(phoneValid).find();
		};
		boolean matchFound = validatePhoneNo.valid(phoneNo);
		if (matchFound)
			System.out.println("Valid Phone Number");
		else
			throw new UserRegistrationException("Please enter proper mobile no");
		return matchFound;
	}

	public static boolean checkPassword(String password) throws UserRegistrationException {
		IValidate validatePassword = passwordValid -> {
			return Pattern.compile(PASSWORD_PATTERN).matcher(passwordValid).find();
		};
		boolean matchFound = validatePassword.valid(password);
		if (matchFound)
			System.out.println("Valid Password");
		else
			throw new UserRegistrationException("Please enter proper password");
		return matchFound;
	}
}
