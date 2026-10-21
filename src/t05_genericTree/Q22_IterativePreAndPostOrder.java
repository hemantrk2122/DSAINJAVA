package t05_genericTree;

import t00_common.Console;

// 22. Iterative preorder & postorder of a Generic Tree (TODO: not solved yet)
public class Q22_IterativePreAndPostOrder {

	public static void iterativePrePost(Node root) {
		// TODO: write your solution
		
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 22. Iterative preorder & postorder of a Generic Tree");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		iterativePrePost(root);
	}
}
