package strings;

import java.util.Stack;

public class Braces_check {

	 public static boolean isValid(String x) {
	        Stack<Character> stk = new Stack<>();

	        for(int i = 0; i < x.length(); i++) {
	            char c = x.charAt(i);

	            if(c == '{') stk.push('}');
	            else if(c == '(') stk.push(')');
	            else if(c == '[') stk.push(']');
	            else {
	                if(!stk.isEmpty() && stk.peek() == c) 
	                	stk.pop();
	                else return false;
	            }
	        }

	        return stk.isEmpty();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp1 = "[()]{}{[()()]()}";
        String exp2 = "[(])";

        System.out.println("Is exp1 valid? " + isValid(exp1)); // Output: true
        System.out.println("Is exp2 valid? " + isValid(exp2)); // Output: false
	}

}
