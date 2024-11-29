package strings;

import java.util.HashMap;

public class Isomorphic_Strings {

	 public static boolean areIsomorphic(String s, String t) {
	        if (s == null || t == null || s.length() != t.length()) {
	            return false;
	        }

	        HashMap<Character, Character> map = new HashMap<>();
	        
	        for (int i = 0; i < s.length(); i++) {
	            char charS = s.charAt(i);
	            char charT = t.charAt(i);
	            
	            if (map.containsKey(charS)) {
	                if (map.get(charS) != charT) {
	                    return false; // Mapping conflict
	                }
	            } else {
	                if (map.containsValue(charT)) {
	                    return false; // One-to-one mapping violated
	                }
	                map.put(charS, charT); // Add mapping
	            }
	        }
	        
	        return true; // No conflicts, strings are isomorphic
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "egg";
	        String t = "add";
	        System.out.println(areIsomorphic(s, t));  // Output: true
	        
	        s = "foo";
	        t = "bar";
	        System.out.println(areIsomorphic(s, t));  // Output: false
	        
	        s = "paper";
	        t = "title";
	        System.out.println(areIsomorphic(s, t));  // Output: true
	}

}
