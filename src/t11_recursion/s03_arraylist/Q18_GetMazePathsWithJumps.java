package t11_recursion.s03_arraylist;

import java.util.ArrayList;

// 18. Get all paths in a Maze with jumps (from 0,0 -> n-1,m-1)
public class Q18_GetMazePathsWithJumps {

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
		System.out.println(getMazePathsWithJump(0, 0, 2, 2));
	}
}
