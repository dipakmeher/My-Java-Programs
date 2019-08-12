package decimaltobinary;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		String x = "";
		String reverse = "";
		int rem,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int dec = sc.nextInt();
		while(dec > 0) {
			rem = dec%2;
			x = x+""+rem;
			dec = dec/2;
		}
		for(i=x.length()-1;i>=0;i--) {
			reverse = reverse + x.charAt(i);
		}
		System.out.println("Binary Number: "+reverse);
	}

}
