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

		Console.section("Edge cases");
		Console.check("single node, present", find(GenericTreeUtils.construct(new int[]{42}), 42), true);
		Console.check("single node, absent", find(GenericTreeUtils.construct(new int[]{42}), 99), false);
		Console.check("value sits at root", find(GenericTreeUtils.construct(new int[]{100,20,-1,30,-1}), 100), true);
	}
}
