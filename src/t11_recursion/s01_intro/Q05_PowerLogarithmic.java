package t11_recursion.s01_intro;

import t00_common.Console;

// 5. Power (Logarithmic)
public class Q05_PowerLogarithmic {

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

	public static void main(String[] args) {
		Console.header("Recursion · 5. Power (Logarithmic)");
		int n = 2, x = 5; // sample input
		Console.result("powerLogarithmic(n, x)", powerLogarithmic(n, x));
	}
}
