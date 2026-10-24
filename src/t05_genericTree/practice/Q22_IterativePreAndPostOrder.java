package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 22. Iterative preorder & postorder  (PRACTICE)
// Produce preorder and postorder WITHOUT recursion (use an explicit stack).
// Preorder of input2: 10 20 50 60 30 70 80 110 120 90 40 100
public class Q22_IterativePreAndPostOrder {

	// TODO: use an explicit stack holding (node, childIndex) state.
	public static void iterativePrePost(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 22. Iterative preorder & postorder  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		iterativePrePost(root);
	}
}
