package t05_genericTree.solution;

import t00_common.Console;

// 18. Ceil & Floor in a Generic Tree (TODO: not solved yet)
public class Q18_CeilAndFloor {

	public static void ceilAndFloor(Node root, int data) {
		// TODO: write your solution
		
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 18. Ceil & Floor in a Generic Tree");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		ceilAndFloor(root, 65);
	}
}
