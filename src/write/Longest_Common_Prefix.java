package write;

public class Longest_Common_Prefix {

	public String CheckLCP(String[] words) {
		
		String prefix = words[0];
		
		for(int i=1;i<words.length;i++) {
			
			while(words[i].indexOf(prefix)!=0) {
				int id = words[i].indexOf(prefix);
				if(id==-1) {
				prefix = prefix.substring(0, prefix.length()-1);
				}else {
					break;
				}
				if(prefix.isEmpty()) {
					return "";
				}
				
			}
			
		}
		
		return prefix;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] words = {"geeks","geeksfor" ,"forgeek", "geezer", "ge"};
		 Longest_Common_Prefix v = new Longest_Common_Prefix();
		 String ans =  v.CheckLCP(words);
		 if(ans.isEmpty()) {
			 System.out.println("No Longest common prefix");
		 }else {
			 System.out.println(ans);
		 }
	}

}
