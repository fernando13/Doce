package fizzBuzz;

import static org.junit.Assert.*;


import org.junit.Test;

public class FizzBuzzTest {
	

	@Test
	public void testOne() {
		String[] a = FizzBuzz.create();
		assertEquals("1", a[0]);
	}
	
	@Test
	public void testThree() throws Exception {
		String[] a = FizzBuzz.create();
		assertEquals("Fizz",a[2]);
	}
	
	@Test
	public void testFive() throws Exception {
		String[] a = FizzBuzz.create();
		assertEquals("Buzz",a[4]);
	}
	
	@Test
	public void testFizzBuzz() throws Exception {
		String[] a = FizzBuzz.create();
		assertEquals("FizzBuzz",a[14]);
	}

	@Test
	public void testMidle() throws Exception {
		String[] a = FizzBuzz.create();
		assertEquals("Buzz", a[49]);
	}
	
	@Test
	public void testHundred() throws Exception {
		String[] a = FizzBuzz.create();
		assertEquals("Buzz", a[99]);
	}
	
	/*@Test
	public void testConstruct() throws Exception {
		FizzBuzz fb = new FizzBuzz();	
	}*/
}