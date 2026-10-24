package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 4. Pre & Post order Traversals  (PRACTICE)
// Print each node on the way down (pre) and on the way up (post) — an Euler tour.
// No return value: compare your printout against the solution file.
public class Q04_PreAndPostOrderTraversal {

	// TODO: print the pre/post (Euler) traversal.
	public static void traversal(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 4. Pre & Post order Traversals  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		traversal(root);
	}
}
