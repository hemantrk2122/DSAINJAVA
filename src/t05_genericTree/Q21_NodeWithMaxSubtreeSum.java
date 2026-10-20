package t05_genericTree;

// 21. Node with maximum subtree sum (TODO: not solved yet)
public class Q21_NodeWithMaxSubtreeSum {

	public static int maxSubtreeSumNode(Node root) {
		// TODO: write your solution
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		System.out.println("Node with max subtree sum: "+maxSubtreeSumNode(root));
	}
}
