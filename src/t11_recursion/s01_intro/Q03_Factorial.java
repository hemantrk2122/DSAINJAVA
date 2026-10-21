package t11_recursion.s01_intro;

import t00_common.Console;

// 3. Print Q03_Factorial
public class Q03_Factorial {

	private static int factorial(int n) {
		if(n==1)return n;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 3. Print Q03_Factorial");
		int n = 5; // sample input
		Console.result("factorial(n)", factorial(n));
	}
}
