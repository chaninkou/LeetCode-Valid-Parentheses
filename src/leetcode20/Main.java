package leetcode20;

public class Main {
	public static void main(String[] args) {
		String s = "{[]}";
		
		System.out.println("Input: " + s);
		
		CheckValidParentheses solution = new CheckValidParentheses();
		
		System.out.println("Solution: " + solution.isValid(s));
	}
}
