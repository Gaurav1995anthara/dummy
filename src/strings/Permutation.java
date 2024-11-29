package strings;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	    public static List<String> generatePermutations(String s) {
	        List<String> result = new ArrayList<>();
	        if (s == null || s.length() == 0) {
	            return result;
	        }
	        backtrack(result, s.toCharArray(), 0);
	        return result;
	    }

	    private static void backtrack(List<String> result, char[] chars, int index) {
	        if (index == chars.length - 1) {
	            result.add(new String(chars));
	            return;
	        }
	        for (int i = index; i < chars.length; i++) {
	            swap(chars, index, i);
	            backtrack(result, chars, index + 1);
	            swap(chars, index, i); // backtrack
	        }
	    }

	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String s = "ABC";
	        List<String> permutations = generatePermutations(s);
	        System.out.println("Permutations of " + s + ": ");
	        for (String permutation : permutations) {
	            System.out.println(permutation);
	        }
	}

}
