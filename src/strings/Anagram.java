package strings;

import java.util.Arrays;

public class Anagram {

	public static void anagram(String a, String b) {
		
		if(a.length()!=b.length()) {
			System.out.println("Not Anagram");
		}else {
			char c[] = a.toCharArray();
			char d[] = b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			
			if(String.valueOf(c).equalsIgnoreCase(String.valueOf(d))) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagarm");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "geeksfor";
		String b = "sefkeogr";
		
		anagram(a,b);
	}

}
