package strings;

public class Longest_Common_Prefix_using_Sorting {

	public static String longestCommonPrefix(String[] words) {
		
		if(words == null || words.length==0) {
			return "";
		}
		
		String prefix = words[0];
		
		for(int i=1;i<words.length;i++) {
			
			while(words[i].indexOf(prefix)!=0) {
				
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}
		
	return prefix;
		
	}
	
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] words = {"geeks", "geeksforges", "geek", "geezer", "ge"};
		 
	        System.out.println(longestCommonPrefix(words)); 
	}

}

/*
  public static String longestCommonPrefix(String[] words) {
	        if (words == null || words.length == 0) {
	            return "";
	        }

	        // Start with the prefix as the first word
	        String prefix = words[0];

	        for (int i = 1; i < words.length; i++) {
	            // Update the prefix by comparing with each word
	            while (words[i].indexOf(prefix) != 0) {
	                // Reduce the prefix by one character from the end
	                prefix = prefix.substring(0, prefix.length() - 1);

	                // If the prefix becomes empty, return an empty string
	                if (prefix.isEmpty()) {
	                    return "";
	                }
	            }
	        }

	        return prefix;
	    }
	    
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] words = {"geeks", "geeksforges", "geek", "geezer", "ge"};
		 
	        System.out.println(longestCommonPrefix(words)); 
	}
*/	    
