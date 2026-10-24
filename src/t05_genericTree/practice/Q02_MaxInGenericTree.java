package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 2. Max in a Generic Tree  (PRACTICE)
// Return the largest value stored anywhere in the tree.
// Expected for `input`: 60
public class Q02_MaxInGenericTree {

	// TODO: return the maximum value in the tree.
	public static int max(Node root) {
		if(root.children.isEmpty())return root.data;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<root.children.size();i++){
			max = Math.max(max,max(root.children.get(i)));
		}
		return Math.max(root.data,max);
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 2. Max in a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("max(root)", max(root), 60);

		Console.section("Edge cases");
		Console.check("single node", max(GenericTreeUtils.construct(new int[]{42})), 42);
		Console.check("root is the largest", max(GenericTreeUtils.construct(new int[]{100,20,-1,30,-1})), 100);
		Console.check("all negative values", max(GenericTreeUtils.construct(new int[]{-5,-2,-1,-9,-1})), -2);
	}
}
