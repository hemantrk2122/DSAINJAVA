package recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionInArrayList {
	// Recursion on the way down
	
	/*
	 * Recursion in ArrayList
	 * 14. Get all Substrings
	 * 15. Get Keypad combinations
	 * 16. Get Stair Paths
	 * 17. Get all paths in a Maze(from 0,0 -> n-1,m-1)
	 * 18. Get all paths in a Maze with jumps(from 0,0 -> n-1,m-1)
	 * */
	
	// Get all substrings
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
	// get keypad combinations
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
	//get stair paths
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
	// get all paths from 0,0 to n-1,m-1
	private static ArrayList<String> getMazePaths(int i, int j, int n, int m) {
		if(i>n || j>m)	return new ArrayList<>();
		if(i==n-1 && j == m-1) {
			ArrayList<String> basePath = new ArrayList<>();
			basePath.add("");
			return basePath;
		}
		ArrayList<String> allPaths = new ArrayList<>();
		// down move
		ArrayList<String> getPaths = getMazePaths(i+1, j, n, m);
		for(String path: getPaths) allPaths.add("r"+path);
		// left move
		getPaths = getMazePaths(i, j+1, n, m);
		for(String path: getPaths) allPaths.add("d"+path);
		return allPaths;
	}
	//  get all paths from 0,0 to n-1,m-1 with jumps
	private static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc){
		if(sr>dr || sc>dc)return new ArrayList<>();
		if(sr==dr && sc==dc) {
			ArrayList<String> basePath = new ArrayList<>();
			basePath.add("");
			return basePath;
		}
		ArrayList<String> ans = new ArrayList<>();
		// horizontal jumps
		for(int i = 1;sc+i<=dc;i++) {
			ArrayList<String> paths = getMazePathsWithJump(sr, sc+i, dr, dc);
			for(String path: paths) ans.add("h"+i+path);
		}
		// vertical jumps
		for(int i = 1;sr+i<=dr;i++) {
			ArrayList<String> paths = getMazePathsWithJump(sr+i, sc, dr, dc);
			for(String path: paths) ans.add("v"+i+path);
		}
		// diagonal jumps
		for(int i = 1; sc+i<=dc && sr+i<=dr; i++) {
			ArrayList<String> paths = getMazePathsWithJump(sr+i, sc+i, dr, dc);
			for(String path: paths) ans.add("d"+i+path);
		}
		return ans;
	}
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(getAllSubstrings(str));
		System.out.println(getKPC("78"));
		System.out.println(getStairPaths(4, 0));
		System.out.println(getMazePaths(0, 0, 3, 3));
		System.out.println(getMazePathsWithJump(0, 0, 2, 2));
	}

}
