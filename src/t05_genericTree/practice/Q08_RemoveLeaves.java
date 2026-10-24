package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 8. Remove leaves from a Generic Tree (LC 1325)  (PRACTICE)
// Remove every leaf node in a single pass. Modify in place.
public class Q08_RemoveLeaves {

	// TODO: drop children that are leaves, then recurse into the survivors.
	public static void removeLeaves(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 8. Remove leaves from a Generic Tree (LC 1325)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.section("Remove Leaves");
		removeLeaves(root);
		GenericTreeUtils.display(root);
	}
}
