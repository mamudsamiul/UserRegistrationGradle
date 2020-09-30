package com.capgemini.usergegistrationgradle;

import org.junit.Test;

import com.capgemini.userregistrationgradle.CheckFormat;
import com.capgemini.userregistrationgradle.UserRegistrationException;

import junit.framework.Assert;

public class TestCaseIndividual {
	@Test
	public void givenFirstName_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkFirstName("Samiul");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper fname", e.getMessage());
		}
	}

	@Test
	public void givenFirstName_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkFirstName("samiul");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper fname", e.getMessage());
		}
	}

	@Test
	public void givenLastName_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkLastName("Mamud");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper lastname", e.getMessage());
		}
	}

	@Test
	public void givenLastName_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkLastName("mamud");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper lastname", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkEmail("abc.xyz@yahoo.co.in");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper email", e.getMessage());
		}
	}

	@Test
	public void givenEmail_Imroper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkEmail("xyz@");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper email", e.getMessage());
		}
	}

	@Test
	public void givenPassword_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkPassword("Xyas");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper password", e.getMessage());
		}
	}

	@Test
	public void givenPassword_Imroper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkPassword("abc");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper password", e.getMessage());
		}
	}

	@Test
	public void givenMobileNo_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkPhone("91 1234567895");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper mobile no", e.getMessage());
		}
	}

	@Test
	public void givenMobileNo_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		try {
			boolean result = user.checkPhone("12345");
			Assert.assertTrue(true);
		} catch (UserRegistrationException e) {
			Assert.assertEquals("Please enter proper mobile no", e.getMessage());
		}
	}
}
