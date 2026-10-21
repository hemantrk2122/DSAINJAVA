package t11_recursion.s05_backtracking;

import t00_common.Console;

// 26. Flood fill
public class Q26_FloodFill {

	private static void floodFill(int[][] maze, int sr, int sc, int dr, int dc, String psf, boolean[][] vis) {
		if(sr == dr && sc == dc) {
			System.out.print(psf+" ");
			return;
		}
		if(sr<0 || sc<0 || sr>dr || sc>dc || maze[sr][sc] == 1 || vis[sr][sc] == true) {
			return;
		}
		vis[sr][sc] = true;

		// tldr
		floodFill(maze, sr-1, sc, dr, dc, psf+"t", vis);
		floodFill(maze, sr, sc-1, dr, dc, psf+"l", vis);
		floodFill(maze, sr+1, sc, dr, dc, psf+"d", vis);
		floodFill(maze, sr, sc+1, dr, dc, psf+"r", vis);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 26. Flood fill");
		int[][] maze = {{0,0,1},{1,0,1},{1,0,0}};
		int n = maze.length;
		int m = maze[0].length;
		boolean[][] vis = new boolean[n][m];
		floodFill(maze, 0, 0, n-1, m-1, "", vis);
	}
}
