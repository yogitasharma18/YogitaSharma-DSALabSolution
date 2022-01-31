package com.greatlearning.driver;

import com.greatlearning.service.BalancedBracketChecker;

public class Main {
	public static void main(String args[]) {
		String input = "([{}])}";
		
		//Object of Class
		BalancedBracketChecker balancedBracketChecker = new BalancedBracketChecker();
		boolean result = balancedBracketChecker.isBalancedBracketFunction(input);
		
		//Print the message according to the result
		if(input.length()<1) {
			System.out.println("String is empty");
		}
		else if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered String do not contain Balanced Brackets");
		}
	}
}
