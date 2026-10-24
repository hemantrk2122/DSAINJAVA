package t05_genericTree.solution;

import t00_common.Console;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// Shared helpers used by every Generic Tree question.
public class GenericTreeUtils {

	// Reads a tree from src/t05_genericTree/<fileName>: first line = count, second line = values (-1 = go up).
	// Paths are relative to the project root (IntelliJ's default working directory).
	public static int[] readInput(String fileName) throws FileNotFoundException {
		String initailPath = "src/t05_genericTree/"+fileName;
		File directory = new File(initailPath);
		Scanner scn = new Scanner(directory);

	    int n = Integer.parseInt(scn.nextLine());
	    String str = scn.nextLine();
	    String[] values = str.split(" ");
	    int[] arr = new int[n];
	    for(int i = 0;i<n;i++)arr[i] = Integer.parseInt(values[i]);
	    scn.close();
	    return arr;
	}

	public static Node construct(int[] arr) {
		Node root = new Node();
		root.data = arr[0];
		Stack<Node> st = new Stack<Node>();
		st.push(root);
//		10 20 -1 30 50 -1 60 -1 -1 40 -1 -1
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] == -1)st.pop();
			else {
				Node n = new Node(arr[i]);
				Node top = st.peek();
				top.children.add(n);
				st.push(n);
			}
		}
		return root;
	}

	// Builds the tree straight from an input file.
	public static Node build(String fileName) throws FileNotFoundException {
		return construct(readInput(fileName));
	}

	// ANSI colours (IntelliJ's Run console and macOS Terminal both support them)
	private static final String RESET = Console.RESTORE; // back to the output colour
	private static final String ROOT = "\u001B[1;35m";   // bold magenta
	private static final String NODE = "\u001B[36m";     // cyan
	private static final String LEAF = "\u001B[32m";     // green
	private static final String LINE = "\u001B[90m";     // grey

	// Draws the tree like the `tree` command:
	// 10
	// ├── 20
	// ├── 30
	// │   ├── 50
	// │   └── 60
	// └── 40
	public static void display(Node root) {
		System.out.println(ROOT+root.data+RESET);
		displayChildren(root, "");
	}

	private static void displayChildren(Node node, String prefix) {
		for(int i = 0;i<node.children.size();i++) {
			Node child = node.children.get(i);
			boolean last = i == node.children.size()-1;
			String colour = child.children.size() == 0 ? LEAF : NODE;
			System.out.println(LINE+prefix+(last ? "└── " : "├── ")+RESET+colour+child.data+RESET);
			displayChildren(child, prefix+(last ? "    " : "│   "));
		}
	}

	public static Node clone(Node root) {
		if(root == null)return null;
		ArrayList<Node> children = new ArrayList<>();
		for(Node child:root.children) {
			children.add(clone(child)); // add child by recursively cloning every child
		}
		Node node = new Node(root.data);
		node.children = children;
		return node;
	}
}
