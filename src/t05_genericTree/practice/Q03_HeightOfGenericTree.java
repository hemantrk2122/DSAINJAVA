package t05_genericTree.practice;

import t05_genericTree.solution.Node;
import t05_genericTree.solution.GenericTreeUtils;
import t00_common.Console;

// 3. Height of a Generic Tree  (PRACTICE)
// Return the height of the tree measured in EDGES (a single node has height 0).
// Expected for `input`: 2
public class Q03_HeightOfGenericTree {

	// TODO: return the height (in edges). Hint: 1 + the TALLEST child, not the sum.
	public static int height(Node root) {
		if(root.children.isEmpty())return 0;
		int height = 0;
		for(int i = 0;i<root.children.size();i++){
			height = Math.max(height,height(root.children.get(i)));
		}
		return height+1;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 3. Height of a Generic Tree  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.check("height(root)", height(root), 2);

		Console.section("Edge cases");
		Console.check("single node (height 0)", height(GenericTreeUtils.construct(new int[]{42})), 0);
		Console.check("two branches each 1 deep (max, not sum!)", height(GenericTreeUtils.construct(new int[]{1,2,5,-1,-1,3,6,-1,-1})), 2);
		Console.check("deep chain", height(GenericTreeUtils.construct(new int[]{5,4,3,2,-1,-1,-1})), 3);
	}
}
