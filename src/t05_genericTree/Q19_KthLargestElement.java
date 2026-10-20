package t05_genericTree;

// 19. Kth largest element in a Generic Tree (TODO: not solved yet)
public class Q19_KthLargestElement {

	public static int kthLargest(Node root, int k) {
		// TODO: write your solution
		return -1;
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input2");
		GenericTreeUtils.display(root);
		System.out.println("3rd largest: "+kthLargest(root, 3));
	}
}
