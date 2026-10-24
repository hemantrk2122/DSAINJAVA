package t05_genericTree.solution;

import t00_common.Console;

import java.util.ArrayList;

// 8. Remove leaves from a Generic Tree (LC 1325)
public class Q08_RemoveLeaves {

	public static void removeLeaves(Node root) {
		ArrayList<Node> children = root.children;
		for(int i = children.size()-1;i>=0;i--) {
			Node child = children.get(i);
			if(child.children.size() == 0)root.children.remove(child);
		}
		for(Node child:children) {
			removeLeaves(child);
		}
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 8. Remove leaves from a Generic Tree (LC 1325)");
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		Console.section("Remove Leaves");
		removeLeaves(root);
		GenericTreeUtils.display(root);
	}
}
