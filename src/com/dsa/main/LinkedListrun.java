package com.dsa.main;



public class LinkedListrun {
	public static void main(String[] args) {
		
		// creating linked list
		LinkedListsImpl singleLinkedList   = new LinkedListsImpl();
		singleLinkedList.head = new ListNode(20);
		ListNode second = new ListNode(15);
		ListNode third = new ListNode(53);
		ListNode fourth = new ListNode(1);

		// point from one to next

		singleLinkedList.head.next = second;
		second.next = third;
		third.next = fourth;
		
		//display
		singleLinkedList.displayList();

	}

}
