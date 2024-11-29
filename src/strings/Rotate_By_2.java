package strings;

public class Rotate_By_2 {

	// rotatesasasas
	 public static boolean canRotate(String a, String b) {
	        if (a.length() != b.length()) {
	            return false; // If lengths are different, 'b' cannot be obtained by rotating 'a'
	        }

	        // Clockwise rotation by 2 places
	        String clockwiseRotated = a.substring(a.length() - 2) + a.substring(0, a.length() - 2);
	        if (clockwiseRotated.equals(b)) {
	            return true;
	        }

	        // Anti-clockwise rotation by 2 places
	        String antiClockwiseRotated = a.substring(2) + a.substring(0, 2);
	        return antiClockwiseRotated.equals(b);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String a = "amazon";
	        String b = "onamaz";
	        if (canRotate(a, b)) {
	            System.out.println("Output: 1");
	        } else {
	            System.out.println("Output: 0");
	        }
		
		 
		
		
		
	}

}
