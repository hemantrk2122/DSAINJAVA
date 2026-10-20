package t11_recursion.s04_onthewayup;

// 21. Print Stair Paths
public class Q21_PrintStairPaths {

	private static void stairPaths(int n, String str) {
		if(n==0) {
			System.out.print(str+" ");
			return;
		}

		if(n<0)return;

		stairPaths(n-1, str+"1");
		stairPaths(n-2, str+"2");
		stairPaths(n-3, str+"3");
	}

	public static void main(String[] args) {
		stairPaths(3,"");
	}
}
