package valid;

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
				// if its empty, that means its odd number of element, if pop()
				// does not equal to current index, then its not ()
				return false;
			}
		}

		// If stack is empty, then it will be true
		return stack.isEmpty();
	}
}
