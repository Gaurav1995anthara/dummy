package strings;

import java.util.ArrayList;
import java.util.List;

public class Permu {

	public static List<String> findPermutations(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        permutation(result, new StringBuilder(s), 0);
        return result;
    }

    private static void permutation(List<String> result, StringBuilder s, int index) {
        if (index == s.length() - 1) {
            result.add(s.toString());
            return;
        }
        for (int i = index; i < s.length(); i++) {
            swap(s, index, i);
            permutation(result, s, index + 1);
            swap(s, index, i); // backtrack
        }
    }

    private static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ABB";
        List<String> permutations = findPermutations(input);
        System.out.println("Permutations of " + input + ": ");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
	}

}
