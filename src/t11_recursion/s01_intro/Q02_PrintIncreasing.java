package t11_recursion.s01_intro;

import t00_common.Console;

// 2. Print Increasing
public class Q02_PrintIncreasing {

	private static void printIncreasing(int n) {
		if(n==0)return;
		printIncreasing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 2. Print Increasing");
		int n = 5; // sample input
		printIncreasing(n);
	}
}
