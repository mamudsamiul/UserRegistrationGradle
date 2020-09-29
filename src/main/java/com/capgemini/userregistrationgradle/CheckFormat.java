package com.capgemini.userregistrationgradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFormat {
	static Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");

	static void check(String data) {
		Matcher matcher = pattern.matcher(data);
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Valid first Name");
		else
			System.out.println("Invalid first Name");
	}
}
