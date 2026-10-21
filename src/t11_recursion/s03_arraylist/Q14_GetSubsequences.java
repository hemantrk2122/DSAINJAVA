package t11_recursion.s03_arraylist;

import t00_common.Console;

import java.util.ArrayList;
import java.util.List;

// 14. Get all Subsequences
public class Q14_GetSubsequences {

	private static List<String> getAllSubstrings(String str) {
		if(str.length()==0) {
			List<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		// getting subStrings removing 1st char in the String
		List<String> subStrings = getAllSubstrings(str.substring(1));

		// including and not including in subStrings
		char firstChar = str.charAt(0);
		List<String> ans = new ArrayList<>();
		for(int i = 0;i<subStrings.size();i++) {
			String s = subStrings.get(i);
			// not including
			ans.add(s);
			// including
			ans.add(firstChar+s);
		}
		return ans;
	}

	public static void main(String[] args) {
		Console.header("Recursion · 14. Get all Subsequences");
		String str = "abc";
		Console.result("getAllSubstrings(str)", getAllSubstrings(str));
	}
}
