package t11_recursion.s02_arrays;

import t00_common.Console;

// 10. Max of an Array
public class Q10_MaxOfArray {

	private static int maxInAnArray(int[] arr, int idx) {
		if(idx>=arr.length)return Integer.MIN_VALUE;
		int max = maxInAnArray(arr,idx+1);
		if(max>arr[idx]) {
			return max;
		}
		return arr[idx];
	}

	public static void main(String[] args) {
		Console.header("Recursion · 10. Max of an Array");
		int[] arr = {1,2,3,4,5,6,7};
		Console.result("Maximum in the array is", maxInAnArray(arr,0));
	}
}
