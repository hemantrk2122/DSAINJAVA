package t11_recursion.s04_onthewayup;

// 19. Print all Subsequences
public class Q19_PrintSubsequences {

	private static void getSubSequences(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		Character top = str.charAt(0);
		//including first char
		getSubSequences(str.substring(1), ans+top);
		//not including first char
		getSubSequences(str.substring(1), ans);
	}

	public static void main(String[] args) {
		getSubSequences("abc", "");
	}
}
