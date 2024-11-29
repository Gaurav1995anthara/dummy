package strings;

public class D {

	public static String multiply(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    // Utility method to reverse a string
    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1 = "0033";
	        String s2 = "2";
	        System.out.println("Output 1: " + multiply(s1, s2)); // Output: 66

	        s1 = "11";
	        s2 = "23";
	        System.out.println("Output 2: " + multiply(s1, s2)); // Output: 253
	}

}
