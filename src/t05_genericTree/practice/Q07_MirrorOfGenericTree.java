package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 7. Mirror of a Generic Tree (LC 101)  (PRACTICE)
// Reverse the children at every node so the tree becomes its mirror image. Modify in place.
public class Q07_MirrorOfGenericTree {

	// TODO: reverse children at every node (recurse).
	public static void mirror(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 7. Mirror of a Generic Tree (LC 101)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.section("Mirror of a GT");
		mirror(root);
		GenericTreeUtils.display(root);
	}
}
