package t11_recursion.s05_backtracking;

// 29. Knight's Tour
public class Q29_KnightsTour {

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
		printKnightTour(new int[5][5], 0, 0, 0);
	}
}
