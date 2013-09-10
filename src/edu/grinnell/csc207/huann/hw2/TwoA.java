package edu.grinnell.csc207.huann.hw2;

public class TwoA {

	/**
	 * Determines if a is a multiple of b
	 */
	public static boolean isMultiple(long a, long b) {
		if (a == 0) {
			return true;
		} //if a is 0
		else if (a == b) {
			return true;
		} //if a equals b
		else if (b == 0) {
			return false;
		} //if b is 0
		else if (a%b == 0) {
			return true;
		} //if a/b results in no remainders
		else {
			return false;
		}  // if not a multiple
	} //isMultiple(long, long)

	
	/**
	 * Determines if an integer i is odd.
	 */
	public static boolean isOdd(int i) {
		if (isMultiple(i, 2)) {
			return false;
		} // if a multiple of 2 (even)
		else {
			return true;
		} // if not even
	} //isOdd(int)
	
	
	/**
	 * Returns the sum of all positive odd numbers less than integer n.
	 */
	public static int oddSumTo(int n) {
		int sum = 0;
		for (int i = 1; i < n; i+=2) {
			sum += i;
		} //for all positive odd numbers less than n
		return sum;
	} //oddSumTo(int)
	
	
	/**
	 * Determines if any pair of numbers in an array of integers has a 
	 * product that is odd.
	 */
	public static boolean isOddProd(int[] ints) {
		int numOdds = 0;
		for (int i = 0; i < ints.length; i++) {
			if (isOdd(ints[i])) {
				numOdds++;
			} //count the number of odds in the array
			if (numOdds > 1) {
				return true;
			} //the product of 2 odd numbers is odd
		} //for every integer in the array
		return false;
	} //isOddProd(int[])
	
	
	/**
	 * Determines whether an array of integers has distinct values.
	 */
	public static boolean allDistinct(int[] ints) {
		for (int i = 0; i < ints.length; i++) {
			for (int j = i+1; j < ints.length; j++) {
				if (ints[i] == ints[j]) {
					return false;
				} //if equal values
			} //for every integer in the array starting from int[1]
		} //for every integer in the array
		return true;
	} //allDistinct(int[])
	
	
	/**
	 * Reverses the order of an array of integers.
	 */
	public static int[] reverseInts(int[] ints) {
		int[] temp = new int[ints.length];
		for (int i = 0; i < ints.length; i++) {
			temp[i] = ints[i];
		} //for every item in the array
		for (int i = 0; i < ints.length; i++) {
			ints[i] = temp[ints.length - (i + 1)];
		} //for every item in the array
		return ints;
	} //reverseInts(int[])

/**
 * Citations: I consulted Jordan in writing the reverseInts method. 
 * I also used the world wide web to re-familiarize myself with
 * relevant mathematical concepts. 
 */
}