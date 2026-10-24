package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 1. Size of a Generic Tree  (PRACTICE)
// Given the root of a generic (N-ary) tree, return the total number of nodes.
// Expected for `input`: 6
public class Q01_SizeOfGenericTree {

	// TODO: return the number of nodes in the tree rooted at `root`.
	public static int size(Node root) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 1. Size of a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("size(root)", size(root), 6);
	}
}
