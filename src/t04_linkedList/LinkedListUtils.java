package t04_linkedList;

// Shared helpers used by the Linked List questions.
public class LinkedListUtils {
	public static Node makeLinkedList(int[] arr) {
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

	public static void printLinkedList(Node node) {
		Node curr = node;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.print("null");
	}
}
