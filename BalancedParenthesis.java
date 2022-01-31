package com.greatlearning.iitr;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static void main (String[] args) {
		
		String input= "([[{}]])";
		
		boolean result = isParenthesisBalanced(input);
		
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
	private static boolean isParenthesisBalanced(String input) {
		
		Stack<Character> stack = new Stack<Character>();
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == '(' || inputArray[i] == '[' || inputArray[i] == '{') {
				stack.push(inputArray[i]);
				continue;
			}
			if(stack.empty()) {
				return false;
			}
			char c;
				
				switch(inputArray[i]) {
				case')':
					 c = stack.pop();
					if(c == ']' || c == '}') {
						return false;
					}
					break;
				case']':
					c = stack.pop();
					if(c == ')' || c == '}') {
						return false;
					}
					break;
				case'}':
					 c = stack.pop();
					if(c == ']' || c == ')') {
						return false;
					}
					break;
				}
			}
			if (stack.isEmpty()) {
				return true;
			} else {
				return false;
				
					
					}
				}
			
			
			
			
	{
	}
}