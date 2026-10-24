package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 13. Distance between two nodes  (PRACTICE)
// Return the number of edges on the path between nodes `i` and `j`.
// Expected distance(110, 100) = 5
public class Q13_DistanceBetweenNodes {

	// TODO: return the edge distance between i and j.
	public static int distance(Node root, int i, int j) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 13. Distance between two nodes  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("distance(110, 100)", distance(root, 110, 100), 5);
	}
}
