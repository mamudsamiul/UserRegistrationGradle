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
}
