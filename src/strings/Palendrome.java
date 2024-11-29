package strings;

public class Palendrome {
	static boolean result = true;
	public static void palendrome(String s) {
		
		char c[] = s.toCharArray();
		
		for(int i=0;i<c.length/2;i++) {
			
			if(Character.toString(c[i]).equalsIgnoreCase(Character.toString(c[c.length-i-1]))) {
				result = true;
			}else {
				result = false;
				break;
			}
		}
		
		if(result) {
			System.out.println("Palendrome");
		}else {
			System.out.println("Not palendrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "nitin";
		palendrome(s);
	}

}
