package edu.grinnell.csc207.huann.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoA {

	@Test
	public void test_isMultiple() {
		for (long b = -50; b < 50; b++) {
			assertEquals("a is 0", true, TwoA.isMultiple(0, b));
		}
		for (long a = -50; a < 0; a++) {
			assertEquals("b is 0, negative a", false, TwoA.isMultiple(a, 0));
		}
		for (long a = 1; a < 50; a++) {
			assertEquals("b is 0, positive a", false, TwoA.isMultiple(a, 0));
		}
		for (long a = -50; a < 50; a++){
			assertEquals("b is 1", true, TwoA.isMultiple(a, 1));
		}
		for (long a = 5; a < 200; a+=5) {
			assertEquals("positive multiples", true, TwoA.isMultiple(a, 5));
			assertEquals("positive multiples", true, TwoA.isMultiple(a, -5));
		}
		for (long a = -20; a < 0; a+=2) {
			assertEquals("negative multiples", true, TwoA.isMultiple(a, -2));
			assertEquals("negative multiples", true, TwoA.isMultiple(a, 2));
		}
		for (long a = 3; a < 200; a+=2) {
			assertEquals("positive non-multiples", false, TwoA.isMultiple(a, 2));
			assertEquals("positive non-multiples", false, TwoA.isMultiple(a, -2));
		}
		for (long a = -15; a < 0; a+=2) {
			assertEquals("negative non-multiples", false, TwoA.isMultiple(a, -2));
			assertEquals("negative non-multiples", false, TwoA.isMultiple(a, 2));
		}
	} //test_isMultiple


	@Test
	public void test_isOdd() {
		for (int i = -50; i < 0; i+=2) {
			assertEquals("negative even", false, TwoA.isOdd(i));
		}
		for (int i = 0; i < 50; i+=2) {
			assertEquals("positive even", false, TwoA.isOdd(i)); 	
		}
		for (int i = -59; i < 0; i+=2) {
			assertEquals("negative odd", true, TwoA.isOdd(i)); 	
		}
		for (int i = 1; i < 50; i+=2) {
			assertEquals("positive odd", true, TwoA.isOdd(i)); 	
		}
		// Integer.MAX_VALUE is 2^31 - 1, which is odd
		assertEquals("MAX_VALUE", true, TwoA.isOdd(Integer.MAX_VALUE));
	} // test_isOdd
	
	
	@Test
	public void test_oddSumTo(){
		for (int n = -50; n < 0; n++) {
			assertEquals("no positive odds", 0, TwoA.oddSumTo(n));
		}
		assertEquals("11", 25, TwoA.oddSumTo(11));
		assertEquals("10", 25, TwoA.oddSumTo(10));
	} //test_OddSumTo


}
