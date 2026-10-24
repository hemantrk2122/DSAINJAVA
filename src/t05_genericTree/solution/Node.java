package t05_genericTree.solution;

import java.util.ArrayList;

public class Node{
	public int data;
	public ArrayList<Node> children;
	
	Node(){
		this.data = 0;
		this.children = new ArrayList<>();
	}
	
	Node(int n){
		this.data = n;
		this.children = new ArrayList<>();
	}
}