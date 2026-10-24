package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 19. Kth largest element  (PRACTICE)
// Return the k-th largest value in the tree.
// Values desc: 120, 110, 100, 90, ... → 3rd largest = 100
public class Q19_KthLargestElement {

	// TODO: return the kth largest value (k-th floor from +infinity is one way).
	public static int kthLargest(Node root, int k) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 19. Kth largest element  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("kthLargest(3)", kthLargest(root, 3), 100);

		Console.section("Edge cases");
		Console.check("largest (k=1)", kthLargest(root, 1), 120);
		Console.check("single node", kthLargest(GenericTreeUtils.construct(new int[]{42}), 1), 42);
	}
}
