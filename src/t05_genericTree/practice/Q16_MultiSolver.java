package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 16. Multi Solver (size, min, max, height in one traversal)  (PRACTICE)
// In a SINGLE traversal, compute size, min, max and height, then print them.
// Expected for input2: size=12, min=10, max=120, height=3
public class Q16_MultiSolver {

	// TODO: one traversal, update static/holder fields for size/min/max/height.
	public static void multiSolver(Node root, int depth) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 16. Multi Solver (size, min, max, height in one traversal)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		multiSolver(root, 0);
	}
}
