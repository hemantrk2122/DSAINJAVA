package t11_recursion.s01_intro;

// 2. Print Increasing
public class Q02_PrintIncreasing {

	private static void printIncreasing(int n) {
		if(n==0)return;
		printIncreasing(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 5; // sample input
		printIncreasing(n);
	}
}
