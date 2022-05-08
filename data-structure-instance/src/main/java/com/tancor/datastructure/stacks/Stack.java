package com.tancor.datastructure.stacks;

public class Stack<T extends Comparable<T>> {

	Node<T> head;

	public void push(T item) {

		Node<T> newNode=new Node<T>(item);

		if(head==null) {
			head=newNode;
		}else {
			newNode.setNextNode(head);
			head=newNode;
		}

	}

	public T pop() {

		if(head==null) {
			return null;
		}

		Node<T> deleteNode=head;
		head=head.getNextNode();

		return deleteNode.getData();

	}

	public T peek() {

		if(head==null) {
			return null;
		}

		return head.getData();

	}

	public void traverse() {

		Node<T> actualNode=head;

		while(actualNode!=null) {
			System.out.println(actualNode.getData());
			actualNode=actualNode.getNextNode();
		}

	}	

}
