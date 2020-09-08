package leetcode20;

import java.util.Stack;

public class CheckValidParentheses {
	public boolean isValid(String s) {
		// FILO
		Stack<Character> stack = new Stack();

		// Going through the whole string
		// Only adding the right side to the stack
		for (char w : s.toCharArray()) {
			if (w == '(') {
				stack.push(')');
			} else if (w == '{') {
				stack.push('}');
			} else if (w == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != w) { // stack.pop() will occur in if statement too
				// if its empty, that means it was not [, ( or }
				// Second statement will check if if its valid
				// Could also use peek() to see if its there first, that way we only need else statement to return false
				return false;
			}
		}

		// If stack is empty that means its valid parenthese
		return stack.isEmpty();
	}
	
	// Another way with switch case instead of if statement
	public boolean isValid2(String s){
		Stack<Character> stack = new Stack();
		
		// But in this case, there might be value that is not the given symbols
		for(char w : s.toCharArray()){
			switch(w){
				case '}' : if(stack.isEmpty() || stack.pop() != '{'){
					return false;
				}
				case ']' : if(stack.isEmpty() || stack.pop() != '['){
					return false;
				}
				case ')' : if(stack.isEmpty() || stack.pop() != '('){
					return false;
				}
				default: stack.push(w);
			}
		}
		
		return stack.isEmpty();
	}
}
