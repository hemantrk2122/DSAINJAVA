package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 10. Find in a Generic Tree (LC 257)  (PRACTICE)
// Return true if `data` exists anywhere in the tree.
// Expected: find(110)=true, find(130)=false
public class Q10_FindInGenericTree {

	// TODO: return whether `data` is present.
	public static boolean find(Node node, int data) {
		return false;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 10. Find in a Generic Tree (LC 257)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("find(110)", find(root, 110), true);
		Console.check("find(130)", find(root, 130), false);
	}
}
