package com.tancor.datastructure.linkedlist;

/***
 * 
 * @author amitt
 *
 * @param <T>
 */
public class SinglelyLinkedList<T extends Comparable<T>> implements List<T>{

	private Node<T> root;	
	private int noOfItems=0;

	@Override
	public void insert(T item) {

		if(root==null) {
			/** this is the first element in the linked list */
			root=new Node<>(item);
		}else {
			/**  we know that this is not the first item */
			insertAtBeginning(item); 
		}	

		noOfItems++;
	}

	/**
	 * Inserting the item at the beginning of the linked list,
	 * setting the current root -> next of new node,
	 * then new node as the current root.
	 *  
	 * @param item
	 */
	private void insertAtBeginning(T item) {
		Node<T> newNode=new Node<>(item);
		newNode.setNextNode(root);
		root=newNode;		
	}

	public void insertAtEnd(T item) {

		Node<T> lastNode=root;

		/**
		 *  finding the last node to insert in the end, 
		 *  after loop finishes, findLastNode will have last the node. 
		 */
		while(lastNode.getNextNode()!=null) {
			lastNode=lastNode.getNextNode();
		}

		/**
		 * creating new node,
		 * then assigning the new node address to current last node. 
		 */
		Node<T> newNode=new Node<>(item);
		lastNode.setNextNode(newNode);	

		noOfItems++;

	}

	@Override
	public void remove(T item) {

		if(root==null) return;

		if(root.getData().compareTo(item)==0) {
			System.out.println(String.format("ITEM TO BE DELETED : %s", root));
			root=root.getNextNode();
			noOfItems--;
		}else {
			remove(item, root , root.getNextNode());
		}

	}

	private void remove(T item, Node<T> previousNode, Node<T> actualNode) {
		while(actualNode!=null) {
			if(actualNode.getData().compareTo(item)==0) {
				System.out.println(String.format("ITEM TO BE DELETED : %s", actualNode));
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode=null;
				noOfItems--;
				break;
			}	
			previousNode=actualNode;
			actualNode=actualNode.getNextNode();
		}		
	}

	@Override
	public void traverse() {

		if(root==null) return;

		Node<T> actualNode=root;
		while(actualNode!=null) {
			System.out.println(actualNode.getData());
			actualNode=actualNode.getNextNode();
		}		

	}

	@Override
	public int size() {
		return noOfItems;
	}
}
