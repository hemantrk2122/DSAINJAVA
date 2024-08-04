package genericTree;

import java.util.ArrayList;

public class Node{
	int data;
	ArrayList<Node> children;
	
	Node(){
		this.data = 0;
		this.children = new ArrayList<>();
	}
	
	Node(int n){
		this.data = n;
		this.children = new ArrayList<>();
	}
}