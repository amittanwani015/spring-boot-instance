package com.tancor.datastructure.linkedlist;

/**
 * 
 * @author amitt
 *
 */
public class DoublyLinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;
	
	
	/**
	 * 
	 * Inserting the node in the last 
	 * 
	 * @param item
	 */
	public void insert(T item) {
		if(tail==null) {		/** if tail is null, that means it is the first element*/
			Node<T> newNode=new Node<T>(item);
			tail=newNode;
			head=newNode;			
		}else{
			insertItemAtEnd(item);
		}			
	}

	/**
	 * 
	 * @param item
	 */
	private void insertItemAtEnd(T item) {
		Node<T> newNode=new Node<T>(item);
		newNode.setPreviousNode(tail);
		tail.setNextNode(newNode);
		tail=newNode;				
	}	
	
	/**
	 * Traversing forward, which means start to end 
	 */
	public void traverseForward() {
		Node<T> actualNode=head;
		while(actualNode!=null) {
			System.out.print(actualNode.getData()+"\t");
			actualNode=actualNode.getNextNode();
		}		
	}
	
	/**
	 * Traversing backward, from end to start
	 */
	public void transverBackward() {
		Node<T> actualNode=tail;
		while(actualNode!=null) {
			System.out.print(actualNode.getData()+"\t");
			actualNode=actualNode.getPreviousNode();
		}	
	}	
	
}
