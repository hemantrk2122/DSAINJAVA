package genericTree;

public class Main {
	public static void main(String[] args) throws Exception{
		
		int[] arr = ReadFile.readfile("input");
		GenericTree genericTree = new GenericTree();
		Node root = genericTree.construct(arr);
		System.out.println();
		
		System.out.println("Generic Tree: ");
		genericTree.display(root);
		System.out.println();
		
		System.out.println("Size of the Generic Tree is: "+genericTree.size(root));
		System.out.println();
		
		System.out.println("Maximum in Generic Tree: "+genericTree.max(root));
		System.out.println();
		
		System.out.println("Height of Generic Tree is: "+genericTree.height(root));
		System.out.println();
		
		System.out.println("Travarsal of a GT: ");
		genericTree.traversal(root);
		System.out.println();
		
		System.out.println("Level order traversal: ");
		genericTree.levelOrderTravarsal(root);
		System.out.println();
		
		System.out.println("New GT: ");
		arr = ReadFile.readfile("input2");
		root = genericTree.construct(arr);
		genericTree.display(root);
		System.out.println("\nMirror of a GT: ");
		genericTree.mirror(root);
		genericTree.display(root);
		System.out.println();
		
		System.out.println("Remove Leaves: ");
		genericTree.removeLeaves(root);
		genericTree.display(root);
		System.out.println();
		
		
	}
	
}
