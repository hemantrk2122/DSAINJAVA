package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 18. Ceil & Floor in a Generic Tree  (PRACTICE)
// Print ceil (smallest value ≥ data) and floor (largest value ≤ data).
// Expected for 65: floor=60, ceil=70
public class Q18_CeilAndFloor {

	// TODO: traverse once, keep best floor (<=data) and best ceil (>=data).
	public static void ceilAndFloor(Node root, int data) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 18. Ceil & Floor in a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		ceilAndFloor(root, 65);
	}
}
