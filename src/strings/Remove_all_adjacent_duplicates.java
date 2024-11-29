package strings;

import java.util.Arrays;
import java.util.Stack;

public class Remove_all_adjacent_duplicates {

	 public static String removeAdjacentDuplicates(String S) {
	        StringBuilder result = new StringBuilder();
	        boolean removed = true;

	        while (removed) {
	            removed = false;
	            int i = 0;
	            while (i < S.length()) {
	                int j = i + 1;
	                while (j < S.length() && S.charAt(j) == S.charAt(i)) {
	                    j++;
	                }
	                if (j - i > 1) {
	                    removed = true;
	                    i = j;
	                } else {
	                    result.append(S.charAt(i));
	                    i++;
	                }
	            }
	            S = result.toString();
	            result.setLength(0);
	        }

	        return S;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        String input2 = "abccbccba";

	       
	        String output2 = removeAdjacentDuplicates(input2);

	       // Output 1: gksforgk
	        System.out.println("Output 2: " + output2);  // Output 2: 
	}

}
