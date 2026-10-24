package practice.t05_genericTree;

import t05_genericTree.Node;
import t05_genericTree.GenericTreeUtils;
import t00_common.Console;
import java.util.LinkedList;
import java.util.Queue;

// 5, 6. Level order traversal (BFS) + linewise (LC 429)  (PRACTICE)
// Print the tree level by level (BFS), one line per level.
// Expected for `input`:
//   10
//   20 30 40
//   50 60
public class Q05_06_LevelOrderTraversal {

	// TODO: BFS with a queue, one line per level.
	public static void levelOrderTravarsal(Node root) {

	}

	public static void main(String[] args) throws Exception {
		Console.header("Generic Tree · 5, 6. Level order traversal (BFS) + linewise (LC 429)  (PRACTICE)");
		Node root = GenericTreeUtils.build("input");
		levelOrderTravarsal(root);
	}
}
