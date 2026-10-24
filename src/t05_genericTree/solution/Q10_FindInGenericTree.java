package t05_genericTree.solution;

import t00_common.Console;

// 10. Find in a Generic Tree (LC 257)
public class Q10_FindInGenericTree {

	public static boolean find(Node node, int data) {
		if(node.data == data)return true;
		boolean ans = false;
		for(Node child:node.children) {
			ans = ans||find(child,data);
			if(ans) {
//				Wherever we are returning true add arrayList to the answer
				System.out.print(child.data+" ");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 10. Find in a Generic Tree (LC 257)");
		Node root = GenericTreeUtils.build("input2");
		Console.result("110", find(root,110));
		Console.result("130", find(root,130));
	}
}
