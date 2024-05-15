package recursion;

public class RecursionOnTheWayUp {
	/*
	 * Recursion on the way up
	 * 19. Print all Substrings
	 * 20. Print Keypad combinations
	 * 21. Print Stair Paths
	 * 22. Print all paths in a Maze(from 0,0 -> n-1,m-1)
	 * 23. Print all paths in a Maze with jumps(from 0,0 -> n-1,m-1)
	 * 24. Print Permutation
	 * 25. Print Encoding
	 * 
	 * */
	
	
	// get all subsequences
	private static void getSubSequences(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		Character top = str.charAt(0);
		//including first char
		getSubSequences(str.substring(1), ans+top);
		//not including first char
		getSubSequences(str.substring(1), ans);
	}
	// Print KPC
	static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	private static void getKPC(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		Character key = str.charAt(0);
		String strAtKey = arr[key-'0'];
		
		for(int i = 0;i<strAtKey.length();i++) {
			getKPC(str.substring(1), ans+strAtKey.charAt(i));
		}
		
	}
	
	// Print Stair Paths
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
	
	// Print Maze Paths
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
	
	// Print Maze Paths with Jump
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
	
	// Print Permutation
	private static void printPermutations(String str, String ans) {
		if(str.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch = str.charAt(0);
		printPermutations(str.substring(1), ans+ch);
		printPermutations(str.substring(1), ans);
	}
	// Print Encodings
	private static void printEncoding(String str, String asf) {
		if(str.length() == 0) {
			System.out.print(asf+" ");
			return;
		}
		char ch = str.charAt(0);
		if(ch=='0')return;
		String toAdd = (char)('a'+Integer.parseInt(ch+"")-1)+"";
		
		String ros = str.substring(1);
		
		printEncoding(ros, asf+toAdd);
		
		// take first 2 characters
		if(str.length()>=2) {
			String first2Chars = str.substring(0,2);
			int idx = Integer.parseInt(first2Chars);
			if(idx<=26 && idx>1) {
				toAdd = (char)('a'+idx-1)+"";
				ros = str.substring(2);
				printEncoding(ros, asf+toAdd);
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		getSubSequences("abc", "");
		System.out.println();
		getKPC("789","");
		System.out.println();
		stairPaths(3,"");
		System.out.println();
		mazePaths(0, 0, 2, 2, "");
		System.out.println();
		mazePathsWithJumps(0, 0, 2, 2, "");
		System.out.println();
		printPermutations("abc","");
		System.out.println();
		printEncoding("1234", "");
	}
}
