package t11_recursion.s04_onthewayup;

import t00_common.Console;

// 23. Print all paths in a Maze with jumps (from 0,0 -> n-1,m-1)
public class Q23_PrintMazePathsWithJumps {

	private static void mazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {
		if(sr == dr && sc == dc) {
			System.out.print(psf+" ");
			return;
		}
		if(sr>dr || sc>dc)return;

		for(int i = 1;sr+i<=dr;i++) {
			mazePathsWithJumps(sr+i, sc, dr, dc, psf+"H"+i);
		}

		for(int i = 1;sc+i<=dc;i++) {
			mazePathsWithJumps(sr, sc+i, dr, dc, psf+"V"+i);
		}

		for(int i = 1;sc+i<=dc && sr+i<=dr;i++) {
			mazePathsWithJumps(sr+i, sc+i, dr, dc, psf+"D"+i);
		}
	}

	public static void main(String[] args) {
		Console.header("Recursion · 23. Print all paths in a Maze with jumps (from 0,0 -> n-1,m-1)");
		mazePathsWithJumps(0, 0, 2, 2, "");
	}
}
