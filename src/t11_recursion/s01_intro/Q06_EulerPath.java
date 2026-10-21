package t11_recursion.s01_intro;

import t00_common.Console;

// 6. Euler's path (pre, in, post area of a recursion tree)
public class Q06_EulerPath {

	private static void eu(int n) {
		if(n==0)return;
		System.out.println("Pre: "+n);
		eu(n-1);
		System.out.println("In: "+n);
		eu(n-1);
		System.out.println("Post: "+n);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 6. Euler's path (pre, in, post area of a recursion tree)");
		int n = 3; // sample input
		eu(n);
	}
}
