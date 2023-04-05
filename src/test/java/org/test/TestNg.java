package org.test;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNg {

		@BeforeMethod
	private void beforeMethod() {
	System.out.println("Before Method");

	}
		@Test
		private void test() {
		System.out.println("Test");
		}
		@AfterClass
		private void afterClass() {
		System.out.println("After Class");

		}
		@AfterMethod
		private void afterMethod() {
		System.out.println("After Method");

		}
		@BeforeClass
		private void beforeClass() {
		System.out.println("Before Class");

		}
}
