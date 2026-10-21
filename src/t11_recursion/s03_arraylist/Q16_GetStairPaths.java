package t11_recursion.s03_arraylist;

import t00_common.Console;

import java.util.ArrayList;

// 16. Get Stair Paths
public class Q16_GetStairPaths {

	private static ArrayList<String> getStairPaths(int n, int idx) {
		if(idx >= n) {
			ArrayList<String> baseCase = new ArrayList<>();
			if(idx>n)return baseCase;
			baseCase.add("");
			return baseCase;
		}

		ArrayList<String> allPaths = new ArrayList<>();
		ArrayList<String> pathsAhead = getStairPaths(n, idx+1);

		for(String path:pathsAhead) {
			allPaths.add("1"+path);
		}

		pathsAhead = getStairPaths(n, idx+2);
		for(String path:pathsAhead) {
			allPaths.add("2"+path);
		}

		pathsAhead = getStairPaths(n,idx+3);
		for(String path:pathsAhead) {
			allPaths.add("3"+path);
		}
		return allPaths;
	}

	public static void main(String[] args) {
		Console.header("Recursion · 16. Get Stair Paths");
		Console.result("getStairPaths(4, 0)", getStairPaths(4, 0));
	}
}
