package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 21. Node with maximum subtree sum  (PRACTICE)
// Return the value of the node whose subtree (itself + all descendants) has the largest sum.
// Expected for input2: 10 (the root, subtree sum = 780)
public class Q21_NodeWithMaxSubtreeSum {

	// TODO: return subtree sum upward; track the node with the max sum seen.
	public static int maxSubtreeSumNode(Node root) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 21. Node with maximum subtree sum  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("maxSubtreeSumNode(root)", maxSubtreeSumNode(root), 10);
	}
}
