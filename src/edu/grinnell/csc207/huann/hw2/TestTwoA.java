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


	@Test
	public void test_IsOddProd() {
		int[] empty = {};
		int[] single = {5};
		int[] posTrue = {1, 3, 5, 2, 4};
		int[] posFalse = {6, 8};
		int[] negTrue = {-1, -3, -8, -10};
		int[] negFalse = {-10, -12, -14};
		int[] mixedTrue = {-1, 5, -14, 6};
		assertEquals("empty", false, TwoA.isOddProd(empty));
		assertEquals("single item", false, TwoA.isOddProd(single));
		assertEquals("positive true", true, TwoA.isOddProd(posTrue));
		assertEquals("positive false", false, TwoA.isOddProd(posFalse));
		assertEquals("negative true", true, TwoA.isOddProd(negTrue));
		assertEquals("negative false", false, TwoA.isOddProd(negFalse));
		assertEquals("mixed true", true, TwoA.isOddProd(mixedTrue));
	} //test_isOddProd


	@Test
	public void test_allDistict() {
		int[] empty = {};
		int[] single = {7};
		int[] distinct = {5, 10, 15, 20};
		int[] notDistinct = {5, 10, 5, 20};
		assertEquals("empty", true, TwoA.allDistinct(empty));
		assertEquals("single item", true, TwoA.allDistinct(single));
		assertEquals("distinct", true, TwoA.allDistinct(distinct));
		assertEquals("not distinct", false, TwoA.allDistinct(notDistinct));
	} //test_allDistinct

	
	@Test
	public void test_reverseInts(){
		int[] empty = {};
		int[] single = {10};
		int[] same = {5, 5, 5};
		int[] ascending = {2, 4, 6, 8, 10};
		int[] descending = {10, 8, 6, 4, 2};
		assertEquals("empty", empty, TwoA.reverseInts(empty));
		assertEquals("single", single, TwoA.reverseInts(single));
		assertEquals("same", same, TwoA.reverseInts(same));
		assertEquals("ascending original", descending, TwoA.reverseInts(ascending));
		assertEquals("descending original", ascending, TwoA.reverseInts(descending));
	} //test_reverseInts
}
