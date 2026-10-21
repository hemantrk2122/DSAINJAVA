package t05_genericTree;

import t00_common.Console;

// 9. Linearize a Generic Tree (LC 114)
public class Q09_LinearizeGenericTree {

	private static Node getTail(Node node) {
		while(node.children.size()>=1)node = node.children.get(0);
		return node;
	}
	public static void linearize(Node root) {
		for(Node child: root.children)linearize(child);
		for(int i = root.children.size()-2;i>=0;i--) {
			Node tail = getTail(root.children.get(i));
			tail.children.add(root.children.get(i+1));
			root.children.remove(i+1);
		}
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 9. Linearize a Generic Tree (LC 114)");
		Node root = GenericTreeUtils.build("input2");
		Node node = GenericTreeUtils.clone(root);
		linearize(node);
		GenericTreeUtils.display(node);
	}
}
