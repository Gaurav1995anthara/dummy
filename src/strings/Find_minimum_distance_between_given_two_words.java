package strings;

public class Find_minimum_distance_between_given_two_words {

	 public static int minDistance(String[] words, String word1, String word2) {
	        if (words == null || words.length == 0) {
	            return -1;
	        }

	        int minDistance = Integer.MAX_VALUE;
	        int posWord1 = -1, posWord2 = -1;

	        for (int i = 0; i < words.length; i++) {
	            String currentWord = words[i];

	            if (currentWord.equals(word1)) {
	                posWord1 = i;
	            } else if (currentWord.equals(word2)) {
	                posWord2 = i;
	            }

	            if (posWord1 != -1 && posWord2 != -1) {
	                int currentDistance = Math.abs(posWord1 - posWord2);
	                minDistance = Math.min(minDistance, currentDistance);
	            }
	        }

	        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
	    }
	public static void main(String[] args) {
		
		  String[] words = {"geeks","for", "geeks", "contribute", "practice"};
	        String word1 = "geeks";
	        String word2 = "practice";
	        System.out.println(minDistance(words, word1, word2));  
	}

}
