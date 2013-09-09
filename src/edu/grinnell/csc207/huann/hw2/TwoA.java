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
		for(int i = 1; i < n; i+=2) {
			sum += i;
		} //for all positive odd numbers less than n
		return sum;
	} //oddSumTo(int)
	
	
	/**
	 * Determines if any pair of numbers in an array of integers has a product that is odd.
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
	 * allDistinct
	 * takes as input an array of int values 
	 * returns true if no two elements have equal values and false otherwise.
	 */
	public static boolean allDistinct(int[] ints) {
		for(int i = 0; i < ints.length; i++) {
			for(int j = i+1; j < ints.length; j++) {
				if(ints[i] == ints[j]) {
					return false;
				} //if
			} //for
		} //for
		return true;
	} //allDistinct(int[])
	
	
	/**
	 * reverseInts
	 * takes as input an array of int values 
	 * reverses their order in the same array
	 */
	public static int reverseInts(int[] ints) {
		for(int i = 0; i < ints.length; i++) {
			
		}
	}

	
	
}
