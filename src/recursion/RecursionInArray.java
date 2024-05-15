package recursion;

public class RecursionInArray {
	
	/*
	 * - Recursion in Arrays
	 * 8. Display Array
	 * 9. Display Array in reverse
	 * 10. Max of an Array
	 * 11. First Index
	 * 12. Last Index
	 * 13. All indices in an Array
	 * */
	private static void printArray(int[] arr, int idx) {
		if(idx>=arr.length)return;
		System.out.print(arr[idx]+" ");
		printArray(arr, idx+1);
	}
	
	private static void printArrayReverse(int[] arr, int idx) {
		if(idx>=arr.length)return;
		printArrayReverse(arr, idx+1);
		System.out.print(arr[idx]+" ");
	}
	
	private static int maxInAnArray(int[] arr, int idx) {
		if(idx>=arr.length)return Integer.MIN_VALUE;
		int max = maxInAnArray(arr,idx+1);
		if(max>arr[idx]) {
			return max;
		}
		return arr[idx];
	}
	
	private static int firstIndex(int[] arr, int idx, int n) {
		if(idx == arr.length)return -1;
		int fi_ahead = firstIndex(arr, idx+1, n);
		if(arr[idx] == n)return idx;
		return fi_ahead;
	}
	
	private static int lastIndex(int[] arr, int idx, int n) {
		if(idx == arr.length)return -1;
		int li_ahead = lastIndex(arr, idx+1, n);
		if(arr[idx]!=n)return li_ahead;
		else {
			if(li_ahead==-1) {
				return idx;
			}else {
				return li_ahead;
			}
		}
	}
	private static int[] findAllIndices(int[] arr, int idx, int x, int fsf) {
		if(idx == arr.length) {
			int[] ans = new int[fsf];
			return ans;
		}
		if(arr[idx] == x) {
			int[] ans = findAllIndices(arr, idx+1, x, fsf+1);
			ans[fsf] = idx;
			return ans;
		}
		return findAllIndices(arr, idx+1, x, fsf);
	
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7};
		printArray(arr,0);
		System.out.println();
		printArrayReverse(arr, 0);
		System.out.println();
		System.out.println("Maximum in the array is: "+maxInAnArray(arr,0));
		int[] array = {1,2,3,3,4,3,4,5};
		System.out.println("First Index of "+3+" in the array is: "+firstIndex(array,0,3));
		System.out.println("Last Index of "+3+" in the array is: "+lastIndex(array,0,3));
		int[] ans = findAllIndices(array, 0, 3, 0);
		for(var ele:ans)System.out.print(ele+" ");
	}
	
	
}
