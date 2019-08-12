package decimaltobinary;

import java.util.Scanner;
public class PallindromeG4G {

	private static Scanner sc;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int num = sc.nextInt();
			
			 int rev = 0;
			 int sum =0;
			 
			  while(num > 0) {
				 sum =  sum + num % 10;
				 num = num / 10;

			 }
			 int sum1 = sum; 
			 while(sum > 0) {                       //reverse
				 rev = rev * 10 + sum % 10;
				 sum = sum / 10;
			 }
			 if(sum1 == rev) {
				 System.out.println("YES");
				 
			 } else {
				 System.out.println("NO");
			 }
		}
	}
		
}
		
		
		
		
		
//		int i,j;
//		
//		String b = "";
//		sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		String []x = new String[a];
//		for (i=0; i<=a; i++) {
//	          x[i] = sc.nextLine();
//	      }
//		
//		for (i=0; i<a; i++) {
//	          System.out.println(x[i]);
//	      }
//		for(j=0;j<a;j++) {
//    		for(i=x[j].length();i>=0;i--) {
//    			b = b + x[j].charAt(i);
//    		}
//    		if(x[j].equalsIgnoreCase(b)) {
//    			System.out.println("YES");
//    		}
//    		else {
//    			System.out.println("NO");
//    		}
//		}
		

