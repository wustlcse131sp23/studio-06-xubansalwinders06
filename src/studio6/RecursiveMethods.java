package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		// FIXME compute the geometric sum for the first n terms recursively
		if (n==0) {
			return 0;
		} 
		else {
			return 1/(Math.pow(2, (n))) + geometricSum(n-1);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {

		if (p % q == 0) {
			return q;
		}
		else {
			return gcd(q, p % q);
		}
		// FIXME compute the gcd of p and q using recursion

	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReverseHelper (int [] emptyArray, int[] array, int counter) {
		if (counter > array.length - 1) {
			return emptyArray;
		}
	else {
		int index = array.length - counter;
		emptyArray[counter] = array [index - 1];
		counter ++;
		return toReverseHelper(emptyArray, array, counter);
		}

	}

	public static int[] toReversed(int[] array) {
		if (array.length != 0) {
			int [] emptyArray = new int[array.length];
			int counter = 0;
			return toReverseHelper (emptyArray, array, counter);
		} else {
			return new int [0];
		}

		// FIXME create a helper method that can recursively reverse the given array
	

	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
//if (radius <= radiusMinimumDrawingThreshold) {
//	
//} else {
//
//	return circlesUponCircles(xCenter, yCenter, radius, radiusMinimumDrawingThreshold);
//	return circlesUponCircles(xCenter + radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
//	return circlesUponCircles(xCenter, yCenter + radius , radius/3.0, radiusMinimumDrawingThreshold);
//	return circlesUponCircles(xCenter, yCenter - radius , radius/3.0, radiusMinimumDrawingThreshold);
//	return circlesUponCircles(xCenter - radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
//	
//
//}
		// FIXME
	}

}
