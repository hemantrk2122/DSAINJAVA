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

		Console.section("Edge cases");
		Console.check("same node (0)", distance(root, 110, 110), 0);
		Console.check("parent & child (1)", distance(root, 80, 110), 1);
		Console.check("values > 127 (== trap)", distance(GenericTreeUtils.construct(new int[]{200,300,-1,400,500,-1,-1}), 300, 500), 3);
	}
}
