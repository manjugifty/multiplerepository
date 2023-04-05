package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");

	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@Test
	public void tc1() {
		System.out.println("test1");
	

	}

}
