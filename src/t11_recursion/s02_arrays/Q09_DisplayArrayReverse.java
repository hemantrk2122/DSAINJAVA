package t11_recursion.s02_arrays;

// 9. Display Array in reverse
public class Q09_DisplayArrayReverse {

	private static void printArrayReverse(int[] arr, int idx) {
		if(idx>=arr.length)return;
		printArrayReverse(arr, idx+1);
		System.out.print(arr[idx]+" ");
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		printArrayReverse(arr, 0);
	}
}
