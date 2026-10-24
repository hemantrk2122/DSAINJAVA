package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;

// 3. Height of a Generic Tree  (PRACTICE)
// Return the height of the tree measured in EDGES (a single node has height 0).
// Expected for `input`: 2
public class Q03_HeightOfGenericTree {

	// TODO: return the height (in edges). Hint: 1 + the TALLEST child, not the sum.
	public static int height(Node root) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 3. Height of a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("height(root)", height(root), 2);
	}
}
