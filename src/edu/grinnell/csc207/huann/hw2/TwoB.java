package edu.grinnell.csc207.huann.hw2;

public class TwoB {
	/**
	 * Compute the average of two integers.  Rounds toward zero if the
	 * average is not a whole number.
	 * Method revised to account for very large int sums.
	 */
	public static int average(int left, int right) {
		return (int) ((double) (left) + (double) (right)) / 2;
	} // average(int,int)
} // class TwoB
