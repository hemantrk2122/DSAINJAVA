package t11_recursion.s05_backtracking;

// 28. N Queens
public class Q28_NQueens {

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

	public static void main(String[] args) {
		int n = 4;
		boolean[][] vis = new boolean[n][n];
		printNQueens(vis, "", 0);
	}
}
