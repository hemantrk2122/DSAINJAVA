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
	// faith(I will get max if I pass Root) -> 
    // step(We should compare root data and recursion data) -> 
	// Expectation(recursion will give max of all children)
	// Base condition(Where to stop looking) -> When no children no look up
	public int maxTest(Node root) {
		if(root.children.size()==0)return root.data;
		int max = root.data;
		for(int i = 0;i<root.children.size();i++) {
			max = Math.max(max, maxTest(root.children.get(i)));
		}
		return max;
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
	
	public Node clone(Node root) {
		if(root == null)return null;
		ArrayList<Node> children = new ArrayList<>();
		for(Node child:root.children) {
			children.add(clone(child)); // add child by recursively cloning every child
		}
		Node node = new Node(root.data);
		node.children = children;
		return node;
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
	private Node getTail(Node node) {
		while(node.children.size()>=1)node = node.children.get(0);
		return node;
	}
	public void linearize(Node root) {
		for(Node child: root.children)linearize(child);
		for(int i = root.children.size()-2;i>=0;i--) {
			Node tail = getTail(root.children.get(i));
			tail.children.add(root.children.get(i+1));
			root.children.remove(i+1);
		} 
	}
	public boolean find(Node node, int data) {
		if(node.data == data)return true;
		boolean ans = false;
		for(Node child:node.children) {
			ans = ans||find(child,data);
			if(ans) {
//				Wherever we are returning true add arrayList to the answer
				System.out.print(child.data+" ");
				return true;
			}
		}
		return false;
	}
	public ArrayList<Integer> nodeToRoot(Node root, int data){
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

	public int lca(Node root, int i, int j) {
		ArrayList<Integer> ntr1 = nodeToRoot(root, i);
		ArrayList<Integer> ntr2 = nodeToRoot(root, j);
		int m = ntr1.size()-1;
		int n = ntr2.size()-1;
		
		while(m>=0 && n>=0 && ntr1.get(m)==ntr2.get(n)) {
			m--;
			n--;
		}
		return ntr1.get(++m);
//		return ntr2.get(++n); both are correct
	}

	public int distance(Node root, int i, int j) {
		ArrayList<Integer> ntr1 = nodeToRoot(root, i);
		ArrayList<Integer> ntr2 = nodeToRoot(root, j);
		int m = ntr1.size()-1;
		int n = ntr2.size()-1;
		
		while(m>=0 && n>=0 && ntr1.get(m)==ntr2.get(n)) {
			m--;
			n--;
		}
		
		return ++m + ++n;
	}

	

}
