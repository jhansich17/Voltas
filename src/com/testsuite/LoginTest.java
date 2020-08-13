package com.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void test1() {

		String expectedResult = "hello";
		String actualResult = "hello123";

		Assert.assertEquals(actualResult, expectedResult);

		/*
		 * if (expectedResult.equalsIgnoreCase(actualResult)) {
		 * System.out.println("Test Passed"); } else {
		 * System.out.println("Test Failed"); }
		 */
	}

}
