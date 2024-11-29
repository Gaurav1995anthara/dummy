package strings;

public class Reverse_words_in_a_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " geeks quiz        practice code";
		String b[] = a.split("\\s+");
		String ans = "";
		for(int i=b.length-1;i>=0;i--) {
			ans = ans + b[i] + " ";
		}
		System.out.println(ans);
	}

}
