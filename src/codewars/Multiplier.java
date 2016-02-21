package codewars;

/**
 * Multiply two ints, but take care of overflow. If the result cannot be 
 * accurately stored in an int, throw an ArithmeticException.
 * @author lenny
 *
 */
public class Multiplier {
	public static int multiply(int a, int b) {
		// ...
		return Math.multiplyExact(a, b);
	}
}
