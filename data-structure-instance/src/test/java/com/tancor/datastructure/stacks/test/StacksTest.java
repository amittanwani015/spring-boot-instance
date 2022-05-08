package com.tancor.datastructure.stacks.test;

import org.junit.Test;

import com.tancor.datastructure.stacks.Stack;

public class StacksTest {

	@Test
	public void stackAsLinkedListTest() {
		
		Stack<String> stack=new Stack<>();
		stack.push("Amit");
		stack.push("Kamal");
		stack.push("Nikhil");
		
		stack.traverse();
		
		System.out.println(String.format("PEEK : %s", stack.peek()));
		System.out.println(String.format("POP : %s", stack.pop()));
		
		stack.traverse();		
		
	}
	
}
