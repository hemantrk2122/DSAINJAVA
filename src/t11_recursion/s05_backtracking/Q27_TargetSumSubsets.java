package t11_recursion.s05_backtracking;

import t00_common.Console;

// 27. Target Sum Subsets
public class Q27_TargetSumSubsets {

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

	public static void main(String[] args) {
		Console.header("Recursion · 27. Target Sum Subsets");
		int[] arr = {10,20,30,40,50,60};
		printTargetSubsets(arr,0, "", 0, 60);
	}
}
