package binarySearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<int[]> testCasesArray = new ArrayList<>();
		List<Integer> daysArray = new ArrayList<>();
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		daysArray.add(5);
		testCasesArray.add(arr); // 5
		int[] arr2 = {3,2,2,4,1,4};
		testCasesArray.add(arr2); // 3
		daysArray.add(3);
		int[] arr3 = {1,2,3,1,1};
		testCasesArray.add(arr3); // 4
		daysArray.add(4);
		
		int test = 3;
		Leet1011 sol = new Leet1011();
		for(int i = 0;i<test;i++) {
			System.out.println((sol.shipWithinDays(testCasesArray.get(i), daysArray.get(i))));
		}
		
	}

}
