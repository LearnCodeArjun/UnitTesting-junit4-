package com.Testingg.services;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServicesTest {
	
	
	//@BeforeClass
	
	@BeforeClass
	public static void init() {
		System.out.println("BEfore all test case");
		System.out.println("start date"+ new Date());
	}
	
	  @Before
	  public void brforeEach() {
		  System.out.println("this method execute before test cases....");
	  }
	//test method of addTwoNumbers 
	@Test
	public void addTwoNumbersTest() {
		System.out.println(" test add two number case");
		int result = CalculatorServices.addTwoNumbers(12,45);
		
		int expected=57;
        assertEquals(expected,result );
	}
	
	@Test
	public void sumAnyNumbersTest() {
		System.out.println(" test sumAnynumber case");
		int result1 = CalculatorServices.sumAnyNumbers(2,6,7,9);
		int expectedResult=24;
		assertEquals(expectedResult, result1);
		
	}
	
	@Test
	public void productTwoNumberstest() {
		int result2 = CalculatorServices.productTwoNumbers(3, 4);
		int expectedresult1=12;
		assertEquals(expectedresult1,result2 );
	}
	
	 @After
	  public void AfterEach() {
		  System.out.println("this method execute after test cases.....");
	  }
	
	//@AfterClass
	@AfterClass
	public static void init1() {
		System.out.println("after all test case");
		System.out.println("end test date"+new Date());
		
	}
	



	



	
}
