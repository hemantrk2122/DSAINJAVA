package recursion;

import java.util.Scanner;

public class Introduction {
	// Principle of mathematical induction.
	/*
	 * - Introduction
	 * 1. Print Decreasing
	 * 2. Print Increasing
	 * 3. Print Factorial
	 * 4. Power(Linear)
	 * 5. Power(Logarithmic)
	 * 6. Euler's path
	 * 7. Tower Of Hanoi
	 * */
	private static void printDecreasing(int n) { // expectaton
		if(n==0)return; // base condition
		System.out.println(n); // bridging faith and expectation
		printDecreasing(n-1); // faith
	}
	
	private static void printIncreasing(int n) {
		if(n==0)return;
		printIncreasing(n-1);
		System.out.println(n);
	}
	
	private static int factorial(int n) {
		if(n==1)return n;
		return n*factorial(n-1);
	}
	
	private static int power(int n, int x) {
		if(x==1)return n;
		return n*power(n,x-1);
	}
	
	private static int powerLogarithmic(int n, int x) {
		if(x==1)return n;
		int power = powerLogarithmic(n,x/2);
		// n = 2, x = 5 -> x/2 = 2 -> power(2,2)*power(2,2) = power(2,4) as one n is left that's why.
		// power(2*2) * power(2*2) * 2
		if(x%2==1) {
			return power*power*n;
		}
		return power * power;
	}
	
	private static void eu(int n) {
		if(n==0)return;
		System.out.println("Pre: "+n);
		eu(n-1);
		System.out.println("In: "+n);
		eu(n-1);
		System.out.println("Post: "+n);
	}
	
	private static void toh(int n, String A, String B, String C) {
		if(n==0)return;
		toh(n-1,A,C,B); // faith is that n-1 disks will be moved from A to C using B
		System.out.println(n+"["+A+"->"+B+"]"); // Now I only have to move nth disk from A to B
		toh(n-1,C,B,A); // Now as nth disks is moved from A, we can move n-1 disks from C to B using A
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printDecreasing(n);
		printIncreasing(n);
		factorial(n);
		
		int x = scn.nextInt();
		System.out.println(power(n, x));
		System.out.println(powerLogarithmic(n, x));
		eu(n);
		toh(3,"A","B","C");
	}

}
