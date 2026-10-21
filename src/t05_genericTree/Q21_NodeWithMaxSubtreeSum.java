package t05_genericTree;

import t00_common.Console;

// 21. Node with maximum subtree sum (TODO: not solved yet)
public class Q21_NodeWithMaxSubtreeSum {

	public static int maxSubtreeSumNode(Node root) {
		// TODO: write your solution
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 21. Node with maximum subtree sum");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.result("Node with max subtree sum", maxSubtreeSumNode(root));
	}
}
