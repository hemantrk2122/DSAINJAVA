package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 17. Predecessor & Successor (preorder)  (PRACTICE)
// Print the preorder predecessor and successor of `data`.
// Preorder of input2: 10 20 50 60 30 70 80 110 120 90 40 100
// Expected for 110: predecessor=80, successor=120
public class Q17_PredecessorAndSuccessor {

	// TODO: track the previously-visited node during a preorder walk.
	public static void predecessorAndSuccessor(Node root, int data) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 17. Predecessor & Successor (preorder)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		predecessorAndSuccessor(root, 110);
	}
}
