package strings;

import java.util.Arrays;

public class Reverse {
	
	// adding reverse comment

	// new cooent
	
	// now develop

	// new cooent helloooo
	
	
	static char temp;
	public static void reverse(String s) {
		
		char c[] = s.toCharArray();
		
		for(int i=0;i<c.length/2;i++) {
			
			 temp = c[i];
			 c[i] = c[c.length-i-1];
			 c[c.length-i-1] = temp;
			
		}
		
		System.out.println(String.valueOf(c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "gaurav";
		reverse(s);
	}

}
