package write;

import java.util.HashMap;

public class LongestSubstringWithKUniqueChars {

	public static String Longk(String str, int k) {
		
		int n = str.length();
		int r = 0;
		int l = 0;
		int ml = -1;
		int s = 0;
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		while(r < n) {
			char rletter = str.charAt(r);
			hm.put(rletter, hm.getOrDefault(rletter, 0)+1);
			r++;
			
			while(hm.size() > k) {
				
				char lletter = str.charAt(l);
				hm.put(lletter, hm.get(lletter)-1);
				if(hm.get(lletter) == 0) {
					hm.remove(lletter);
				}
				l++;
			}
			
			if(hm.size() == k && r-l > ml) {
				ml = r-l;
				s = l;
			}
		}
		
		return str.substring(s, s+ml);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabacbebebe";
        int k = 3;
        
        String ans = Longk(str,k);
        System.out.println(ans);
        System.out.println(ans.length());
	}

}
