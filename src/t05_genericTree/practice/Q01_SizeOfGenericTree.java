package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 1. Size of a Generic Tree  (PRACTICE)
// Given the root of a generic (N-ary) tree, return the total number of nodes.
// Expected for `input`: 6
public class Q01_SizeOfGenericTree {

	// TODO: return the number of nodes in the tree rooted at `root`.
	public static int size(Node root) {
		if(root.children.isEmpty())return 1;
		int size = 0;
		for(int i = 0;i<root.children.size();i++){
			size += size(root.children.get(i));
		}
		return size+1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 1. Size of a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("size(root)", size(root), 6);

		Console.section("Edge cases");
		Console.check("single node", size(GenericTreeUtils.construct(new int[]{42})), 1);
		Console.check("root has children", size(GenericTreeUtils.construct(new int[]{100,20,-1,30,-1})), 3);
		Console.check("deep chain", size(GenericTreeUtils.construct(new int[]{5,4,3,2,-1,-1,-1})), 4);
	}
}
