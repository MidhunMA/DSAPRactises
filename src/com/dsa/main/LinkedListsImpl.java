package com.dsa.main;

class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListsImpl {

	// linked list have a data + next node ,initially head.next will be null
	// access modifier is default , ie visible in package

	ListNode head;

	// node is defining inside itself // or outside as well, now in outside

	public void displayList() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

}
