package com.greatlearning.service;

import java.util.Stack;

public class BalancedBracketChecker {

	public boolean isBalancedBracketFunction(String str) {
		
		//Stack of Character type
		Stack<Character> st = new Stack<Character>();
		
		//Traversing a string str
		for(int i = 0; i < str.length(); i++) {
	        Character ch = str.charAt(i);
	        if(!st.isEmpty() && ch == '}' && st.peek() == '{') {
	        	st.pop();
	        } 
	        else if(!st.isEmpty() && ch == ')' && st.peek() == '(') {
				st.pop();
	        } 
	        else if(!st.isEmpty() && ch == ']' && st.peek() == '[') {
                st.pop();
	        } 
	        else {
	        	st.push(ch);
	        }
	    }
	    if(st.isEmpty()) {
	       return true;
	    } 
	    return false;        
	 }
}
