package com.capgemini.usergegistrationgradle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.capgemini.userregistrationgradle.CheckFormat;
import com.capgemini.userregistrationgradle.UserRegistrationException;

import junit.framework.Assert;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

@RunWith(Parameterized.class)
public class UserRegistrationTestCase {
	private String emailAddress;
	private boolean expectedResult;
	private CheckFormat validateEmail;

	public UserRegistrationTestCase(String emailAddress, boolean expectedResult) {
		this.emailAddress = emailAddress;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		validateEmail = new CheckFormat();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc.xyz@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com", true },
				{ "abc+100@gmail.com", true } });
	}

	@Test
	public void check() {
		CheckFormat checkFormat = new CheckFormat();
		try {
			boolean result=checkFormat.checkEmail(emailAddress);
			assertEquals(expectedResult,result);
		}catch(UserRegistrationException e) {
			Assert.assertEquals("Please Enter Proper email", e.getMessage());
		}
		
	}
}
