package t11_recursion.s01_intro;

// 4. Power (Linear)
public class Q04_PowerLinear {

	private static int power(int n, int x) {
		if(x==1)return n;
		return n*power(n,x-1);
	}

	public static void main(String[] args) {
		int n = 2, x = 5; // sample input
		System.out.println(power(n, x));
	}
}
