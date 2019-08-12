package decimaltobinary;
import java.util.*;
public class Pallindrome {

	private static Scanner sc;

	public static void main(String[] args) {
		int i;
		String b = "";
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		for(i=x.length()-1;i>=0;i--) {
			b = b + x.charAt(i);
		}
		if(x.equalsIgnoreCase(b)) {
			System.out.println("Pallindrome.\n");
		}
		else {
			System.out.println("Not a Pallindrome.\n");
		}

	}

}
