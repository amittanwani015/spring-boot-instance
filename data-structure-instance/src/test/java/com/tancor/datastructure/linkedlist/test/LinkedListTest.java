package com.tancor.datastructure.linkedlist.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.tancor.datastructure.linkedlist.DoublyLinkedList;
import com.tancor.datastructure.linkedlist.SinglelyLinkedList;

/**
 * 
 * @author amitt
 *
 */
public class LinkedListTest {

	@Test
	public void testSingleyLinkedList() {

		System.out.println();
		System.out.println("SINGLEY LINKED LIST TEST");

		SinglelyLinkedList<String> sll=new SinglelyLinkedList<>();

		sll.insert("Amit");
		sll.insert("Jyoti");
		sll.insert("Meeta");
		sll.insert("Kamal");
		sll.insert("Nikhil");
		
		sll.traverse();

		String findMiddleNode = sll.findMiddleNode();
		System.out.println(String.format("MIDDLE NODE : %s", findMiddleNode));

		sll.traverse();

		sll.remove("Jyoti");
		assertTrue(sll.size()>0);
		sll.traverse();		

		System.out.println("REVERSING THE LINKEDLIST WITH O(1) SPACE COMPLEXITY");
		sll.reverseLinkedList();
		sll.traverse();
		
		System.out.println();
	}

	@Test
	public void testDoublyLinkedList() {

		System.out.println("DOUBLY LINKED LIST TEST");

		System.out.println();
		DoublyLinkedList<String> dll=new DoublyLinkedList<>();

		dll.insert("Amit");
		dll.insert("Jyoti");
		dll.insert("Meeta");
		dll.insert("Lucky");

		System.out.println();
		System.out.println("FORWARD TRAVERSE");
		dll.traverseForward();

		System.out.println();
		System.out.println("BACKWARD TRAVERSE");
		dll.transverBackward();

		System.out.println();

	}
}
