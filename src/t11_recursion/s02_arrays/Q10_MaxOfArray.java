package t11_recursion.s02_arrays;

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
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println("Maximum in the array is: "+maxInAnArray(arr,0));
	}
}
