package t11_recursion.s01_intro;

import t00_common.Console;

// 7. Tower Of Hanoi
public class Q07_TowerOfHanoi {

	private static void toh(int n, String A, String B, String C) {
		if(n==0)return;
		toh(n-1,A,C,B); // faith is that n-1 disks will be moved from A to C using B
		System.out.println(n+"["+A+"->"+B+"]"); // Now I only have to move nth disk from A to B
		toh(n-1,C,B,A); // Now as nth disks is moved from A, we can move n-1 disks from C to B using A
	}

	public static void main(String[] args) {
		Console.header("Recursion · 7. Tower Of Hanoi");
		toh(3,"A","B","C");
	}
}
