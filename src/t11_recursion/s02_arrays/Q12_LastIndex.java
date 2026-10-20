package t11_recursion.s02_arrays;

// 12. Last Index
public class Q12_LastIndex {

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

	public static void main(String[] args) {
		int[] array = {1,2,3,3,4,3,4,5};
		System.out.println("Last Index of "+3+" in the array is: "+lastIndex(array,0,3));
	}
}
