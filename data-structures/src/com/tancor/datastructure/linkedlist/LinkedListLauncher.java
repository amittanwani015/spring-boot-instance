package com.tancor.datastructure.linkedlist;

public class LinkedListLauncher{

	public static void main(String[] args) {

		SinglelyLinkedList<String> al=new SinglelyLinkedList<>();
		al.insert("Amit");
		al.insert("Jyoti");
		al.insert("Meeta");
		al.insert("Lucky");
		al.traverse();

		System.out.println();

		al.remove("Jyoti");
		al.traverse();

		System.out.println();

		al.insertAtEnd("Kamal");
		al.traverse();

		System.out.println();

		System.out.println(String
				.format("SIZE OF LINKEDLIST : %s", al.size()));			
	}
}
