package t11_recursion.s04_onthewayup;

// 24. Print Permutations
public class Q24_PrintPermutations {

	private static void printPermutations(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = str.charAt(0);
		printPermutations(str.substring(1), ans+ch);
		printPermutations(str.substring(1), ans);
	}

	public static void main(String[] args) {
		printPermutations("abc","");
	}
}
