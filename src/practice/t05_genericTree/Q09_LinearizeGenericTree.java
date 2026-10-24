package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 9. Linearize a Generic Tree (LC 114)  (PRACTICE)
// Flatten the tree so every node has at most one child (a chain in pre-order).
public class Q09_LinearizeGenericTree {

	// TODO: linearize. Hint: a helper that returns the tail avoids the O(n^2) re-walk.
	public static void linearize(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 9. Linearize a Generic Tree (LC 114)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Node node = GenericTreeUtils.clone(root);
		linearize(node);
		GenericTreeUtils.display(node);
	}
}
