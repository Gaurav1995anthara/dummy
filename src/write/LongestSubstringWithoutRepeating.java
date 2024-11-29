package write;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

	public static String findSub(String str) {
		
		int n = str.length();
		int r = 0;
		int l = 0;
		int ml = 0;
		int s = 0;
		
		HashSet<Character> hs = new HashSet<Character>();
		
		while(r < n) {
			
			if(!hs.contains(str.charAt(r))) {
				hs.add(str.charAt(r));
				r++;
				
				if(r-l > ml) {
					ml = r-l;
					s = l;
				}
			}else {
				
				hs.remove(str.charAt(l));
				l++;
			}
		}
		
		return str.substring(s, s+ml);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "cbcabhcc";
		String result = findSub(str);
		System.out.println(result);
		System.out.println(result.length());
	}

}
