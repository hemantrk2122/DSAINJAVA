package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 2. Max in a Generic Tree  (PRACTICE)
// Return the largest value stored anywhere in the tree.
// Expected for `input`: 60
public class Q02_MaxInGenericTree {

	// TODO: return the maximum value in the tree.
	public static int max(Node root) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 2. Max in a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("max(root)", max(root), 60);
	}
}
