package reversethestring;

public class ReverseTheString {

	public static void main(String[] args) {
		String str = "like.i";
		String b="";
		int i;
		for(i=str.length()-1;i>=0;i--) {
			b = b + str.charAt(i);
		}
		System.out.println(""+b);
	}

}
