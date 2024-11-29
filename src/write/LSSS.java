package write;

import java.util.HashSet;

public class LSSS {

	public static String findLongestSubstringWithoutRepeating(String str) {
        int n = str.length();
        int left = 0, right = 0, maxLength = 0;
        int start = 0; // To store the starting index of the longest substring
        HashSet<Character> set = new HashSet<>();

        // Sliding window technique
        while (right < n) {
            // Try to extend the window with non-repeating characters
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                right++;
                // Update the maxLength and the start index of the longest substring found
                if (right - left > maxLength) {
                    maxLength = right - left;
                    start = left;
                }
            } else {
                // If a repeating character is found, shrink the window from the left
                set.remove(str.charAt(left));
                left++;
            }
        }

        // Return the longest substring
        return str.substring(start, start + maxLength);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "cbcabhcc";
	        String longestSubstr = findLongestSubstringWithoutRepeating(str);
	        System.out.println("Longest substring without repeating characters: " + longestSubstr);
	        System.out.println("Length: " + longestSubstr.length());
	}

}
