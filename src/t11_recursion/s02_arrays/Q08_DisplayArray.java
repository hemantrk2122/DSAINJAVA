package t11_recursion.s02_arrays;

// 8. Display Array
public class Q08_DisplayArray {

	private static void printArray(int[] arr, int idx) {
		if(idx>=arr.length)return;
		System.out.print(arr[idx]+" ");
		printArray(arr, idx+1);
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		printArray(arr,0);
	}
}
