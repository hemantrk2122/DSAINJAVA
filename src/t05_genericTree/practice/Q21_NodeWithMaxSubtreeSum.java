package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
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

		Console.section("Edge cases");
		Console.check("non-root subtree wins", maxSubtreeSumNode(GenericTreeUtils.construct(new int[]{-50,100,-1})), 100);
		Console.check("single node", maxSubtreeSumNode(GenericTreeUtils.construct(new int[]{42})), 42);
	}
}
