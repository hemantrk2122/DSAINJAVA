package t05_genericTree.solution;

import t00_common.Console;

import java.util.ArrayList;

// 12. Lowest Common Ancestor (LC 236)
public class Q12_LowestCommonAncestor {

	public static int lca(Node root, int i, int j) {
		ArrayList<Integer> ntr1 = Q11_NodeToRootPath.nodeToRoot(root, i);
		ArrayList<Integer> ntr2 = Q11_NodeToRootPath.nodeToRoot(root, j);
		int m = ntr1.size()-1;
		int n = ntr2.size()-1;

		while(m>=0 && n>=0 && ntr1.get(m)==ntr2.get(n)) {
			m--;
			n--;
		}
		return ntr1.get(++m);
//		return ntr2.get(++n); both are correct
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 12. Lowest Common Ancestor (LC 236)");
		Node root = GenericTreeUtils.build("input2");
		Console.result("LCA of 110 and 90 is", lca(root,110,90));
	}
}
