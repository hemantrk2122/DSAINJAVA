package t05_genericTree;

// 4. Pre & Post order Traversals
public class Q04_PreAndPostOrderTraversal {

	public static void traversal(Node root) {
		System.out.println("Pre: "+root.data);
		for(int i = 0;i<root.children.size();i++) {
			Node node = root.children.get(i);
			System.out.println("Edge Pre: "+root.data+"->"+node.data);
			traversal(node);
			System.out.println("Edge Post: "+node.data+"->"+root.data);
		}
		System.out.println("Post: "+root.data);
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input");
		traversal(root);
	}
}
