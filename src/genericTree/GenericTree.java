package genericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class GenericTree {
	public Node construct(int[] arr) {
		Node root = new Node();
		root.data = arr[0];
		Stack<Node> st = new Stack<Node>();
		st.push(root);
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
	
	public void display(Node root) {
		System.out.print(root.data+"-> ");
		for(int i =0;i<root.children.size();i++) {
			Node child = root.children.get(i);
			System.out.print(child.data+" ");
		}
		System.out.println();
		for(int i =0;i<root.children.size();i++) {
			display(root.children.get(i));
		}
	}
	
	public int size(Node root) {
		if(root.children.size() == 0)return 1;
		int size = 0;
		for(int i = 0;i<root.children.size();i++) {
			size+=size(root.children.get(i));
		}
		return 1+size;
	}
	
	public int max(Node root) {
		if(root.children.size()==0)return root.data;
		int max = root.data;
		for(int i = 0;i<root.children.size();i++) {
			max = Math.max(max, max(root.children.get(i)));
		}
		return max;
	}
	
	public int height(Node root) {
		if(root.children.size()==0)return 0;
		int height = 1;
		for(int i = 0;i<root.children.size();i++) {
			height+=height(root.children.get(i));
		}
		return height;
	}
	
	public void traversal(Node root) {
		System.out.println("Pre: "+root.data);
		for(int i = 0;i<root.children.size();i++) {
			Node node = root.children.get(i);
			System.out.println("Edge Pre: "+root.data+"->"+node.data);
			traversal(node);
			System.out.println("Edge Post: "+node.data+"->"+root.data);
		}
		System.out.println("Post: "+root.data);
	}
	
	public void levelOrderTravarsal(Node root) {
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
	
	public void mirror(Node root) {
		List<Node> children = root.children;
		int i = 0;
		int j = children.size()-1;
		while(i<j) {
			Node a = children.get(i);
			Node b = children.get(j);
			
			children.set(i, b);
			children.set(j, a);
			
			i++;
			j--;
		}
		
		for(Node node: children)mirror(node);
	}
	
	public void removeLeaves(Node root) {
		ArrayList<Node> children = root.children;
		for(int i = children.size()-1;i>=0;i--) {
			Node child = children.get(i);
			if(child.children.size() == 0)root.children.remove(child);
		}
		for(Node child:children) {
			removeLeaves(child);
		}
	}

}
