package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;
import java.util.ArrayList;

// 11. Node to Root path  (PRACTICE)
// Return the path from the node holding `data` up to the root, starting with `data`.
// Expected for 110: [110, 80, 30, 10]
public class Q11_NodeToRootPath {

	// TODO: return the node-to-root path (empty list if not found).
	public static ArrayList<Integer> nodeToRoot(Node root, int data) {
		return new ArrayList<>();
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 11. Node to Root path  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("nodeToRoot(110)", nodeToRoot(root, 110), "[110, 80, 30, 10]");
	}
}
