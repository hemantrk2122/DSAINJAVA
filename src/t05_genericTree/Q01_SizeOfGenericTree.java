package t05_genericTree;

import t00_common.Console;

// 1. Size of a Generic Tree
public class Q01_SizeOfGenericTree {

	public static int size(Node root) {
		if(root.children.size() == 0)return 1;
		int size = 0;
		for(int i = 0;i<root.children.size();i++) {
			size+=size(root.children.get(i));
		}
		return 1+size;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 1. Size of a Generic Tree");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.result("Size of the Generic Tree is", size(root));
	}
}
