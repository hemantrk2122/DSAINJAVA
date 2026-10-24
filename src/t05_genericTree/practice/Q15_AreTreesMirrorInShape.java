package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;
import t05_genericTree.solution.Q07_MirrorOfGenericTree;

// 15. Are trees mirror in shape?  (PRACTICE)
// Mirror = children counts match in REVERSE order at every level (values ignored).
// Expected: a tree is a mirror of its mirrored clone → true
public class Q15_AreTreesMirrorInShape {

	// TODO: compare shapes, pairing child i of one with child (n-1-i) of the other.
	public static boolean isMirror(Node root, Node root2) {
		return false;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 15. Are trees mirror in shape?  (PRACTICE)");
		Node root = GenericTreeUtils.build("input2");
		Node mir = GenericTreeUtils.clone(root);
		Q07_MirrorOfGenericTree.mirror(mir);  // oracle: a correct mirror
		Console.check("isMirror(root, mirrored)", isMirror(root, mir), true);

		Console.section("Edge cases");
		Console.check("asymmetric vs itself (not a mirror)", isMirror(GenericTreeUtils.construct(new int[]{1,2,5,-1,-1,3,-1}), GenericTreeUtils.construct(new int[]{1,2,5,-1,-1,3,-1})), false);
		Console.check("single vs single", isMirror(GenericTreeUtils.construct(new int[]{42}), GenericTreeUtils.construct(new int[]{7})), true);
	}
}
