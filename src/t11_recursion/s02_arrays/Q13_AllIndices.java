package t11_recursion.s02_arrays;

import t00_common.Console;

// 13. All indices in an Array
public class Q13_AllIndices {

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

	public static void main(String[] args) {
		Console.header("Recursion · 13. All indices in an Array");
		int[] array = {1,2,3,3,4,3,4,5};
		int[] ans = findAllIndices(array, 0, 3, 0);
		for(var ele:ans)System.out.print(ele+" ");
	}
}
