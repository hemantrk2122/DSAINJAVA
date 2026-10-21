package t05_genericTree;

import t00_common.Console;

// 19. Kth largest element in a Generic Tree (TODO: not solved yet)
public class Q19_KthLargestElement {

	public static int kthLargest(Node root, int k) {
		// TODO: write your solution
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 19. Kth largest element in a Generic Tree");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.result("3rd largest", kthLargest(root, 3));
	}
}
