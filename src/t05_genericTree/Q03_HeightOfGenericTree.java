package t05_genericTree;

import t00_common.Console;

// 3. Height of a Generic Tree
public class Q03_HeightOfGenericTree {

	public static int height(Node root) {
		if(root.children.size()==0)return 0;
		int height = 1;
		for(int i = 0;i<root.children.size();i++) {
			height+=height(root.children.get(i));
		}
		return height;
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 3. Height of a Generic Tree");
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		Console.result("Height of Generic Tree is", height(root));
	}
}
