package t04_linkedList;

// LC 876. Middle of the Linked List (fast & slow pointers)
public class Q01_MiddleOfLinkedList {

	public static int findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,9,7,10,12};
		Node head = LinkedListUtils.makeLinkedList(arr);
		LinkedListUtils.printLinkedList(head);
		System.out.println();
		System.out.println(findMiddle(head));
	}
}
