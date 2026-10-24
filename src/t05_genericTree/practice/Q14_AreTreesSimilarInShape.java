package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 14. Are trees similar in shape?  (PRACTICE)
// Similar = every corresponding node has the SAME number of children (values ignored).
// Expected: a tree is similar to a clone of itself → true
public class Q14_AreTreesSimilarInShape {

	// TODO: compare shapes.
	public static boolean isSimilar(Node root, Node root2) {
		return false;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 14. Are trees similar in shape?  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Node copy = GenericTreeUtils.clone(root);
		Console.check("isSimilar(root, clone)", isSimilar(root, copy), true);

		Console.section("Edge cases");
		Console.check("same shape, diff values", isSimilar(GenericTreeUtils.construct(new int[]{1,2,-1,3,-1}), GenericTreeUtils.construct(new int[]{9,8,-1,7,-1})), true);
		Console.check("different shapes", isSimilar(root, GenericTreeUtils.construct(new int[]{42})), false);
	}
}
