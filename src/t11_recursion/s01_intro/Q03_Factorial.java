package t11_recursion.s01_intro;

// 3. Print Q03_Factorial
public class Q03_Factorial {

	private static int factorial(int n) {
		if(n==1)return n;
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		int n = 5; // sample input
		System.out.println(factorial(n));
	}
}
