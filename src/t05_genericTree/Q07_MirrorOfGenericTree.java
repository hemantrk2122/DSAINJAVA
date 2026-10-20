package t05_genericTree;

import java.util.List;

// 7. Mirror of a Generic Tree (LC 101)
public class Q07_MirrorOfGenericTree {

	public static void mirror(Node root) {
		List<Node> children = root.children;
		int i = 0;
		int j = children.size()-1;
		while(i<j) {
			Node a = children.get(i);
			Node b = children.get(j);

			children.set(i, b);
			children.set(j, a);

			i++;
			j--;
		}

		for(Node node: children)mirror(node);
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		System.out.println("\nMirror of a GT: ");
		mirror(root);
		GenericTreeUtils.display(root);
	}
}
