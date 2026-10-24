package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 20. Diameter of a Generic Tree  (PRACTICE)
// Return the diameter: the number of edges on the longest path between any two nodes.
// Expected for input2: 5
public class Q20_DiameterOfGenericTree {

	// TODO: at each node combine the two tallest child heights (+2). Needs a CORRECT height.
	public static int getDiameter(Node root) {
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 20. Diameter of a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Console.check("getDiameter(root)", getDiameter(root), 5);

		Console.section("Edge cases");
		Console.check("single node (0)", getDiameter(GenericTreeUtils.construct(new int[]{42})), 0);
		Console.check("deep chain", getDiameter(GenericTreeUtils.construct(new int[]{5,4,3,2,-1,-1,-1})), 3);
		Console.check("two leaves under root", getDiameter(GenericTreeUtils.construct(new int[]{1,2,-1,3,-1})), 2);
	}
}
