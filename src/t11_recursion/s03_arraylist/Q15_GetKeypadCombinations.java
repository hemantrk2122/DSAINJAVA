package t11_recursion.s03_arraylist;

import java.util.ArrayList;

// 15. Get Keypad combinations
public class Q15_GetKeypadCombinations {

	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	private static ArrayList<String> getKPC(String str){
		if(str.length() == 0) {
			ArrayList<String> baseArray = new ArrayList<>();
			baseArray.add("");
			return baseArray;
		}
		ArrayList<String> smallKPC = getKPC(str.substring(1));
//		System.out.println(str+smallKPC);

		ArrayList<String> ans = new ArrayList<>();
		String currentCombination = arr[(str.charAt(0)-'0')];
		for(int i = 0;i<currentCombination.length();i++) {
			char ch = currentCombination.charAt(i);
			for(int j = 0;j<smallKPC.size();j++) {
				ans.add(ch+smallKPC.get(j));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(getKPC("78"));
	}
}
