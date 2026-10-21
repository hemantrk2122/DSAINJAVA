package t11_recursion.s01_intro;

import t00_common.Console;

// 4. Power (Linear)
public class Q04_PowerLinear {

	private static int power(int n, int x) {
		if(x==1)return n;
		return n*power(n,x-1);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 4. Power (Linear)");
		int n = 2, x = 5; // sample input
		Console.result("power(n, x)", power(n, x));
	}
}
