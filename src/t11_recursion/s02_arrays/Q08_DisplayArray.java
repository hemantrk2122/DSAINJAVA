package t11_recursion.s02_arrays;

import t00_common.Console;

// 8. Display Array
public class Q08_DisplayArray {

	private static void printArray(int[] arr, int idx) {
		if(idx>=arr.length)return;
		System.out.print(arr[idx]+" ");
		printArray(arr, idx+1);
	}

	public static void main(String[] args) {
		Console.header("Recursion · 8. Display Array");
		int[] arr = {1,2,3,4,5,6,7};
		printArray(arr,0);
	}
}
