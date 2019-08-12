package leafyear;

public class LeafYear {
	
	public static void main(String[] args) {
		int n=200;
		if(LeafYear(n)) {
			System.out.println("Its a leaf year.");
		}
		else {
			System.out.println("Its not a leaf year.");
		}
	}

	private static boolean LeafYear(int n) {
		return ((n%400==0)||(n%4==0 && n%100 != 0));
	}

}
