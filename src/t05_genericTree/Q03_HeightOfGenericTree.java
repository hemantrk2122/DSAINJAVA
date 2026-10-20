package t05_genericTree;

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
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		System.out.println("Height of Generic Tree is: "+height(root));
	}
}
