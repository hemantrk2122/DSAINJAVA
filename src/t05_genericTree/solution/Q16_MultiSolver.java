package t05_genericTree.solution;

import t00_common.Console;

// 16. Multi Solver (size, min, max, height in one traversal) (TODO: not solved yet)
public class Q16_MultiSolver {

	public static void multiSolver(Node root, int depth) {
		// TODO: write your solution
		
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 16. Multi Solver (size, min, max, height in one traversal)");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		multiSolver(root, 0);
	}
}
