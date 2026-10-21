package t11_recursion.s03_arraylist;

import t00_common.Console;

import java.util.ArrayList;

// 17. Get all paths in a Maze (from 0,0 -> n-1,m-1)
public class Q17_GetMazePaths {

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

	public static void main(String[] args) {
		Console.header("Recursion · 17. Get all paths in a Maze (from 0,0 -> n-1,m-1)");
		Console.result("getMazePaths(0, 0, 3, 3)", getMazePaths(0, 0, 3, 3));
	}
}
