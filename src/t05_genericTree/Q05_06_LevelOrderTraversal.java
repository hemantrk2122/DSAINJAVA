package t05_genericTree;

import t00_common.Console;

import java.util.LinkedList;
import java.util.Queue;

// 5, 6. Level order traversal (BFS) + level order linewise (LC 429)
public class Q05_06_LevelOrderTraversal {

	public static void levelOrderTravarsal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(q.size()>0) {
			int size = q.size();
			while(size-->0) {
				Node curr = q.peek();
				q.poll();
				System.out.print(curr.data+" ");
				for(Node node:curr.children) {
					q.add(node);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 5, 6. Level order traversal (BFS) + level order linewise (LC 429)");
		Node root = GenericTreeUtils.build("input");
		levelOrderTravarsal(root);
	}
}
