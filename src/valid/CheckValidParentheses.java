package valid;

import java.util.Stack;

public class CheckValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack();

		for (char w : s.toCharArray()) {
			if (w == '(') {
				stack.push(')');
			} else if (w == '{') {
				stack.push('}');
			} else if (w == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != w) {
				// if its empty, that means its odd number of element, if pop()
				// does not equal to current index, then its not ()
				return false;
			}
		}

		return stack.isEmpty();
	}
}
