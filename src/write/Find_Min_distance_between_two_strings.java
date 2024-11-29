package write;

public class Find_Min_distance_between_two_strings {
	static int finalresult = 0;
	public static int distance(String[] words,String word1,String word2) {
		
		int p1 = -1;
		int p2 = -1;
		
		for(int i=0;i<words.length;i++) {
			
			if(words[i] == word1) {
				p1 = i;
			}
			if(words[i] == word2) {
				p2 = i;
			}
		}
		
		int ans = Math.abs(p1-p2);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  String[] words = {"geeks","for", "geeks", "contribute", "pj", "practice"};
	      String word1 = "geeks";
	      String word2 = "practice";
	      
	      int result = distance(words,word1,word2);
	      finalresult = result-1;
	      
	      if(finalresult == 0) {
	    	  System.out.println("There is no words between these 2 words");
	      }else {
	    	  System.out.println("the distance is : " + finalresult);
	      }
	      
	        
	}

}
