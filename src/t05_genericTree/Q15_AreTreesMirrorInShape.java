package t05_genericTree;

// 15. Are trees mirror in shape? (TODO: not solved yet)
public class Q15_AreTreesMirrorInShape {

	public static boolean isMirror(Node root, Node root2) {
		// TODO: write your solution
		return false;
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		System.out.println("Mirror in shape (with itself): "+isMirror(root, root));
	}
}
