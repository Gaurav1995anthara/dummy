package strings;

public class IPaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "222.12.12.196";
		String b[] = a.split("\\.");
		boolean ans = true;
		if(b.length!=4) {
			System.out.println("Not a IP Address");
		}
		
		for(int i=0;i<b.length;i++) {
			
			if(Integer.parseInt(b[i]) >= 0 && Integer.parseInt(b[i]) < 256 ) {
				ans = true;
			}else {
				ans = false;
				break;
			}
		}
		
		if(true) {
			System.out.println("correct");
		}else {
			System.out.println("wrong");
		}
	}

}
