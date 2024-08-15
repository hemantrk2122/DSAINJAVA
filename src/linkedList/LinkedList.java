package linkedList;

public class LinkedList {
	Node makeLinkedList(int[] arr) {
		Node head = new Node();
		head.data = arr[0];
		Node curr = head;
		for(int i = 1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			curr.next = temp;
			curr = curr.next;
		}
		return head;
	}
	
	void printLinkedList(Node node) {
		Node curr = node;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.print("null");
	}

	public int findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
