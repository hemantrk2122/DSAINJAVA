package t11_recursion.s02_arrays;

import t00_common.Console;

// 11. First Index
public class Q11_FirstIndex {

	private static int firstIndex(int[] arr, int idx, int n) {
		if(idx == arr.length)return -1;
		int fi_ahead = firstIndex(arr, idx+1, n);
		if(arr[idx] == n)return idx;
		return fi_ahead;
	}

	public static void main(String[] args) {
		Console.header("Recursion · 11. First Index");
		int[] array = {1,2,3,3,4,3,4,5};
		Console.result("First index of " + 3, firstIndex(array,0,3));
	}
}
