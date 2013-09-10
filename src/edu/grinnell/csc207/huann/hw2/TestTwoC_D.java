package edu.grinnell.csc207.huann.hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoC_D {
	
	Rational first = new Rational (5, 6);
	Rational second = new Rational (0, 0);
	Rational third = new Rational (-6, 9);
	Rational fourth = new Rational (7, 44);
	Rational fifth = new Rational (8, 15);
	Rational sixth = new Rational (15, 8);

	@Test
	public void testNumerator() {
		assertEquals("numerical1", 5, first.numerator());
		assertEquals("numerical2", 0, second.numerator());
		assertEquals("numerical3", -6, third.numerator());
	}

	@Test
	public void testDenominator() {
		assertEquals("denom1", 7, fourth.denominator());
		assertEquals("denom2", 0, second.denominator());
		assertEquals("denom3", 8, fifth.denominator());
	}

	@Test
	public void testMultiply() {
		assertEquals("mult1", 8, fifth.multiply(15));
		assertEquals("mult2", 0, second.multiply(15));
		assertEquals("mult3", -2, third.multiply(2));
	}

	@Test
	public void testDivide() {
		assertEquals("div1", -1/3, third.divide(2));
	}

	@Test
	public void testAdd() {
		assertEquals("add1", 2, second.add(2));
	}

	@Test
	public void testSubtract() {
		assertEquals("subtract1", 0, second.subtract(second));
	}

	@Test
	public void testCreateRational() {
		assertEquals("create1", first, TwoC.createRational(5, 6));
		assertEquals("create2", second, TwoC.createRational(0, 0));
	}

	@Test
	public void testInverse() {
		assertEquals("inverse1", sixth, fifth.inverse())
	}
}
