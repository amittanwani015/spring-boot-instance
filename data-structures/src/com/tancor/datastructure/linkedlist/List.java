package com.tancor.datastructure.linkedlist;

public interface List<T> {
	
	/**
	 * 
	 * @param item
	 */
	public void insert(T item);
	
	/**
	 * 
	 * @param item
	 */
	public void remove(T item);
	
	/**
	 * 
	 */
	public void traverse();
	
	/**
	 * 
	 */
	public int size();	
}
