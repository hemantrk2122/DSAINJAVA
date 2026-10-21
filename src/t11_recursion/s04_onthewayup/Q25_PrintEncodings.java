package t11_recursion.s04_onthewayup;

import t00_common.Console;

// 25. Print Encodings
public class Q25_PrintEncodings {

	private static void printEncoding(String str, String asf) {
		if(str.length() == 0) {
			System.out.print(asf+" ");
			return;
		}
		char ch = str.charAt(0);
		if(ch=='0')return;
		String toAdd = (char)('a'+Integer.parseInt(ch+"")-1)+"";

		String ros = str.substring(1);

		printEncoding(ros, asf+toAdd);

		// take first 2 characters
		if(str.length()>=2) {
			String first2Chars = str.substring(0,2);
			int idx = Integer.parseInt(first2Chars);
			if(idx<=26 && idx>1) {
				toAdd = (char)('a'+idx-1)+"";
				ros = str.substring(2);
				printEncoding(ros, asf+toAdd);
			}
		}

	}

	public static void main(String[] args) {
		Console.header("Recursion · 25. Print Encodings");
		printEncoding("1234", "");
	}
}
