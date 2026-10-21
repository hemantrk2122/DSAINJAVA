package t11_recursion.s04_onthewayup;

import t00_common.Console;

// 22. Print all paths in a Maze (from 0,0 -> n-1,m-1)
public class Q22_PrintMazePaths {

	private static void mazePaths(int sr, int sc, int dr, int dc, String psf) {
		if(sr==dr && sc == dc) {
			System.out.print(psf+" ");
			return;
		}
		if(sr>dr || sc > dc) {
			return;
		}

		mazePaths(sr+1, sc, dr, dc, psf+"H");
		mazePaths(sr, sc+1, dr, dc, psf+"V");
	}

	public static void main(String[] args) {
		Console.header("Recursion · 22. Print all paths in a Maze (from 0,0 -> n-1,m-1)");
		mazePaths(0, 0, 2, 2, "");
	}
}
