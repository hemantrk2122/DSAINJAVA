package t05_genericTree;

import t00_common.Console;

import java.util.ArrayList;

// 11. Node to Root path
public class Q11_NodeToRootPath {

	public static ArrayList<Integer> nodeToRoot(Node root, int data){
		if(root.data == data) {
			ArrayList<Integer> ba = new ArrayList<Integer>();
			ba.add(data);
			return ba;
		}
		for(Node child:root.children) {
			ArrayList<Integer> ans = nodeToRoot(child, data);
			if(ans.size()!=0) {
				ans.add(root.data);
				return ans;
			}
		}
		return new ArrayList<>();
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 11. Node to Root path");
		Node root = GenericTreeUtils.build("input2");
		Console.result("Node 110 to root path", nodeToRoot(root, 110));
		Console.result("Node 90 to root path", nodeToRoot(root, 90));
	}
}
