package c1;

public class _12types {

	public static void main(String[] args) {
		_19(1, 2);
	}

	/**
	 * What is the value of (Math.sqrt(2) * Math.sqrt(2) == 2)?
	 */
	public static void _13() {
		int num = 2;
		double sqrt = Math.sqrt(num);
		System.out.printf("sqrt(%d) = %f\n", num, sqrt);

		double pro = sqrt * sqrt;
		System.out.printf("%f * %f = %f\n", sqrt, sqrt, pro);

	}

	/**
	 * Write a program that takes three positive integers as command-line arguments and prints true if any one of them is greater than or equal to the
	 * sum of the other two and false otherwise. (Note : This computation tests whether the three numbers could be the lengths of the sides of some
	 * triangle.)
	 */
	public static void _15(int a, int b, int c) {
		int sum = a + b + c;
		boolean res = (a >= (sum - a) || b >= (sum - b) || c >= (sum - c));
		System.out.printf("(%d, %d, %d)=%b", a, b, c, res);
	}

	/**
	 * Write a program that takes two int values a and b from the command line and prints a random integer between a and b.
	 */
	public static void _19(int a, int b) {
		double random = Math.random();
		int num = a + (int) (random * ((b - a + 1)));
		System.out.printf("%f --> %d", random, num);
	}
}
