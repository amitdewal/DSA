package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launch {
	public static int countDigit(int n) {

		int count = 0;

		while (n > 0) {
			n = n / 10;// log10(N) complexity
			count++;
		}
		return count;
	}

	public static int reverseDigit(int n) {

		int reverseNumber = 0;
		int lastDigit;

		while (n > 0) {
			lastDigit = n % 10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
			n = n / 10;
		}

		return reverseNumber;
	}

	public static void palindrome(int n) {
		int temp = n;
		int reverse = 0;
		int lastDigit;

		while (n > 0) {
			lastDigit = n % 10;
			reverse = (reverse * 10) + lastDigit;
			n = n / 10;
		}

		if (temp == reverse) {
			System.out.println("true");

		} else {
			System.out.println("false");

		}

	}

	public static void isArmstrongNum(int n) {
		int temp = n;
		int sum = 0;
		int lastDigit;
		int numberOfDigits = 0;
		// count number of digits
		while (n > 0) {
			numberOfDigits++;
			n = n / 10;
		}
		n = temp;
		while (n > 0) {
			lastDigit = n % 10;
			sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void printDivisors(int n) {

		List<Integer> l = new ArrayList<>();

		/* int sqn = (int)Math.sqrt(n); */
		for (int i = 1; i * i <= n; i++) {

			if (n % i == 0) {
				System.out.print(i + " ");
				l.add(i);

				if ((n / i) != i) {// other factor
					System.out.print(n / i + " ");
					l.add(n / i);
				}

			}
		}
		Collections.sort(l);
		System.out.println();
		System.out.println(l);

	}

	public static void isPrimeNum(int n) {

		int count = 0;

		for (int i = 1; i * i <= n; i++) {

			if (n % i == 0) {
				count++;
				// System.out.println(i+" ");

				if ((n / i) != i) {// other factor
					// System.out.println(i+" ");
					count++;
				}
			}

		}
		if (count == 2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static int findGCD(int a, int b) {

		while (a > 0 && b > 0) {

			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}

		}
		if (a == 0) {
			return b;
		} else {
			return a;
		}

	}

	public static void main(String[] args) {
		// System.out.println("Digits in the number is:: "+countDigit(12345));
		// System.out.println("Digits in the number is:: "+countDigit(87));
		// System.out.println(reverseDigit(671));
		// palindrome(9);
		// isArmstrongNum(8201);

		// printDivisors(36);
		// isPrimeNum(11);
		System.out.println(findGCD(12, 4));

	}

}
