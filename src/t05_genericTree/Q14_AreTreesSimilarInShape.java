package t05_genericTree;

// 14. Are trees similar in shape? (TODO: not solved yet)
public class Q14_AreTreesSimilarInShape {

	public static boolean isSimilar(Node root, Node root2) {
		// TODO: write your solution
		return false;
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		System.out.println("Similar in shape (with itself): "+isSimilar(root, GenericTreeUtils.clone(root)));
	}
}
