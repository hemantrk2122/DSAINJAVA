package t05_genericTree.solution;

import t00_common.Console;

// 17. Predecessor & Successor of an element (preorder) (TODO: not solved yet)
public class Q17_PredecessorAndSuccessor {

	public static void predecessorAndSuccessor(Node root, int data) {
		// TODO: write your solution
		
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 17. Predecessor & Successor of an element (preorder)");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		predecessorAndSuccessor(root, 110);
	}
}
