package t11_recursion.s04_onthewayup;

import t00_common.Console;

// 20. Print Keypad combinations
public class Q20_PrintKeypadCombinations {

	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	private static void getKPC(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		Character key = str.charAt(0);
		String strAtKey = arr[key-'0'];

		for(int i = 0;i<strAtKey.length();i++) {
			getKPC(str.substring(1), ans+strAtKey.charAt(i));
		}

	}

	public static void main(String[] args) {
		Console.header("Recursion · 20. Print Keypad combinations");
		getKPC("789","");
	}
}
