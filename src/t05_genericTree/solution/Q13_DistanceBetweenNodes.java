package t05_genericTree.solution;

import t00_common.Console;

import java.util.ArrayList;

// 13. Distance between two nodes in a Generic Tree
public class Q13_DistanceBetweenNodes {

	public static int distance(Node root, int i, int j) {
		ArrayList<Integer> ntr1 = Q11_NodeToRootPath.nodeToRoot(root, i);
		ArrayList<Integer> ntr2 = Q11_NodeToRootPath.nodeToRoot(root, j);
		int m = ntr1.size()-1;
		int n = ntr2.size()-1;

		while(m>=0 && n>=0 && ntr1.get(m)==ntr2.get(n)) {
			m--;
			n--;
		}

		return ++m + ++n;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 13. Distance between two nodes in a Generic Tree");
		Node root = GenericTreeUtils.build("input2");
		Console.result("Distance between nodes 110 & 100", distance(root, 110,100));
	}
}
