package com.capgemini.usergegistrationgradle;

import org.junit.Test;

import com.capgemini.userregistrationgradle.CheckFormat;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class UserRegistrationTestCase {
	@Test
	public void givenFirstName_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkFirstName("Samiul");
		Assert.assertTrue(true);
	}

	@Test
	public void givenFirstName_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkFirstName("samiul");
		Assert.assertFalse(false);
	}

	@Test
	public void givenLastName_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkLastName("Mamud");
		Assert.assertTrue(true);
	}

	@Test
	public void givenLastName_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkLastName("mamud");
		Assert.assertFalse(false);
	}

	@Test
	public void givenEmail_Proper_ReturnTruee() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkEmail("abc.xyz@yahoo.co.in");
		Assert.assertTrue(true);
	}

	@Test
	public void givenEmail_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkEmail("samiul");
		Assert.assertFalse(false);
	}

	@Test
	public void givenPassword_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkPassword("Xaf123@");
		Assert.assertTrue(true);
	}

	@Test
	public void givenPassword_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkPassword("mamud");
		Assert.assertFalse(false);
	}

	@Test
	public void givenMobileNo_Proper_ReturnTrue() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkPhone("91 1234567895");
		Assert.assertTrue(true);
	}

	@Test
	public void givenMobileNo_Improper_ReturnFalse() {
		CheckFormat user = new CheckFormat();
		boolean result = user.checkPhone("12345");
		Assert.assertFalse(false);
	}
}
