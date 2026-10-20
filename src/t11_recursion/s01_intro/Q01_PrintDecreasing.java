package t11_recursion.s01_intro;

// 1. Print Decreasing  (Principle of mathematical induction)
public class Q01_PrintDecreasing {

	private static void printDecreasing(int n) { // expectaton
		if(n==0)return; // base condition
		System.out.println(n); // bridging faith and expectation
		printDecreasing(n-1); // faith
	}

	public static void main(String[] args) {
		int n = 5; // sample input
		printDecreasing(n);
	}
}
