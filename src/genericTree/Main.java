package genericTree;

public class Main {
	public static void main(String[] args) throws Exception{
		
		int[] arr = ReadFile.readfile("input");
		GenericTree genericTree = new GenericTree();
		Node root = genericTree.construct(arr);
		System.out.println();
		
		System.out.println("0. Generic Tree: ");
		genericTree.display(root);
		System.out.println();
		
		System.out.println("1. Size of the Generic Tree is: "+genericTree.size(root));
		System.out.println();
		
		System.out.println("2. Maximum in Generic Tree: "+genericTree.maxTest(root));
		System.out.println();
		
		System.out.println("3. Height of Generic Tree is: "+genericTree.height(root));
		System.out.println();
		
		System.out.println("4. Travarsal of a GT: ");
		genericTree.traversal(root);
		System.out.println();
		
		System.out.println("5, 6. Level order traversal: ");
		genericTree.levelOrderTravarsal(root);
		System.out.println();
		
		System.out.println("New GT: ");
		arr = ReadFile.readfile("input2");
		root = genericTree.construct(arr);
		genericTree.display(root);
		System.out.println("\n7. Mirror of a GT: ");
		genericTree.mirror(root);
		genericTree.display(root);
		genericTree.mirror(root); // to revert the changes.
		System.out.println();
		
		System.out.println("8. Remove Leaves: ");
//		genericTree.removeLeaves(root);
		genericTree.display(root);
		System.out.println();

		System.out.println("9. Linearize GT: ");
		Node node = genericTree.clone(root);
		genericTree.linearize(node);
		genericTree.display(node);
		System.out.println();
		
		System.out.println("10. Find in GT:");
		System.out.println("    110: "+genericTree.find(root,110));
		System.out.println("    130: "+genericTree.find(root,130));
		System.out.println();
		
		System.out.println("11. Node 110 to root path: "+genericTree.nodeToRoot(root, 110));
		System.out.println("    Node 90 to root path: "+genericTree.nodeToRoot(root, 90));
		System.out.println();
		
		System.out.println("12. LCA of 110 and 90 is: "+genericTree.lca(root,110,90));
		System.out.println();
		
		System.out.println("13. Distance between nodes 110 & 100: "+genericTree.distance(root, 110,100));
		System.out.println();
		
		
	}
	
}
