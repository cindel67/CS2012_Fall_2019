package book_examples;

import java.math.BigInteger;

public class LargeFactorial {
	public static void main(String[] args) {
		System.out.println("50! is \n" + LargeFactorial.factorial1(50));
		//System.out.println(factorial2(25));
		System.out.println(factorial1(10000));
	}

	public static BigInteger factorial1(long n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i+""));
		}

		return result;
	}

	public static long factorial2(long n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		return result;
	}
}
