package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 12. Lowest Common Ancestor (LC 236)  (PRACTICE)
// Return the value of the lowest common ancestor of `i` and `j`.
// Expected lca(110, 90) = 30
public class Q12_LowestCommonAncestor {

	// TODO: return the LCA value. Beware comparing Integer with == above 127.
	public static int lca(Node root, int i, int j) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 12. Lowest Common Ancestor (LC 236)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("lca(110, 90)", lca(root, 110, 90), 30);
	}
}
