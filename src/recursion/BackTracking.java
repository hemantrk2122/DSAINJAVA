package recursion;

public class BackTracking {
	/*
	 * BackTracking
	 * 26. Flood fill
	 * 27. Target Sum Subsets
	 * 28. N Queens
	 * 29. Knights Tour
	 * */
	
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
	
	// sos -> sum of subset
	private static void printTargetSubsets(int[] arr, int idx, String asf, int sos, int tar) {
		if(idx == arr.length) {
			if(sos == tar) {
				System.out.print(asf.substring(0,asf.length()-1)+" ");
			}
			return;
		}
		
		//include
		printTargetSubsets(arr, idx+1, asf+arr[idx]+",", sos+arr[idx], tar);
		
		// not include
		printTargetSubsets(arr, idx+1, asf, sos, tar);
	}
	
	// N - Queens
	private static boolean isQueenSafe(boolean[][] chess, int row, int col) {
		int n = chess.length;
		
		int[][] dirs = {{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1}};
		for(int dis = 1;dis<=n;dis++) {
			for(int[] dir:dirs) {
				int rm = dir[0];
				int cm = dir[1];
				
				int nrow = row+rm*dis;
				int ncol = col+cm*dis;
				
				if(nrow>=0 && nrow<n && ncol>=0 && ncol<n) {
					if(chess[nrow][ncol])return false;
				}
			}
		}
		return true;
	}
	private static void printNQueens(boolean[][] chess, String qsf, int row) {
		if(row == chess.length) {
			System.out.print("["+qsf.substring(0,qsf.length()-1)+"]");
			return;
		}
		for(int col = 0;col<chess.length;col++) {
			if(isQueenSafe(chess,row,col)) {
				chess[row][col] = true;
				printNQueens(chess, qsf+"{"+row+","+col+"},", row+1);
				chess[row][col] = false;
			}
		}
	}
	
	// Print Knight tours
	static int[][] dirs = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
	private static void printKnightTour(int[][] chess, int r, int c, int upcomingMove) {
		int n = chess.length;
		if(r<0 || r>=n || c<0 || c>=n || chess[r][c]!=0)return;
		if(upcomingMove == n*n-1) {
			displayBoard(chess);
			System.out.println();
			return;
		}
		
		chess[r][c] = upcomingMove;
//		https://leetcode.com/problems/check-knight-tour-configuration/
//		Check this question on leetcode
//		System.out.println(r+" "+c+" "+chess[r][c]+" "+upcomingMove);
		
		for(int[] dir:dirs) {
			printKnightTour(chess, r+dir[0], c+dir[1], upcomingMove+1);
		}
		
		chess[r][c] = 0;
	}
	private static void displayBoard(int[][] board) {
		for(int[] col: board) {
			for(int ele:col) {
				System.out.print(ele+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] maze = {{0,0,1},{1,0,1},{1,0,0}};
		int n = maze.length;
		int m = maze[0].length;
		boolean[][] vis = new boolean[n][m];
		floodFill(maze, 0, 0, n-1, m-1, "", vis);
		System.out.println();
		int[] arr = {10,20,30,40,50,60};
		printTargetSubsets(arr,0, "", 0, 60);
		System.out.println();
		n = 4;
		vis = new boolean[n][n];
		printNQueens(vis, "", 0);
		System.out.println();
		printKnightTour(new int[5][5], 0, 0, 0);
	}

}
