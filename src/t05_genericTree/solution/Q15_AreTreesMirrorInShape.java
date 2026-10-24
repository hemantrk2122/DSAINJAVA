package t05_genericTree.solution;

import t00_common.Console;

// 15. Are trees mirror in shape? (TODO: not solved yet)
public class Q15_AreTreesMirrorInShape {

	public static boolean isMirror(Node root, Node root2) {
		// TODO: write your solution
		return false;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 15. Are trees mirror in shape?");
		Console.todo("Not solved yet: write your solution above, then run again.");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.result("Mirror in shape (with itself)", isMirror(root, root));
	}
}
