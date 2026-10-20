package t05_genericTree;

// 2. Max in a Generic Tree
public class Q02_MaxInGenericTree {

	// faith(I will get max if I pass Root) ->
    // step(We should compare root data and recursion data) ->
	// Expectation(recursion will give max of all children)
	// Base condition(Where to stop looking) -> When no children no look up
	public static int max(Node root) {
		if(root.children.size()==0)return root.data;
		int max = root.data;
		for(int i = 0;i<root.children.size();i++) {
			max = Math.max(max, max(root.children.get(i)));
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		Node root = GenericTreeUtils.build("input");
		GenericTreeUtils.display(root);
		System.out.println("Maximum in Generic Tree: "+max(root));
	}
}
