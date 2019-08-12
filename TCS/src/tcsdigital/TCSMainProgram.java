package tcsdigital;
import java.util.*;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.lang.Math; 
public class TCSMainProgram {
	static boolean isprime(int a) {
		int i,count=0;
		for(i=2;i<=Math.sqrt(a);i++){
			if(a%i==0) {
				count++;
			}
		}
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
	
		 long start = System.currentTimeMillis();
		int i,x,y,pair=0;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(i=m;i<n;i++) {
			if(i>= 4 && i%2==0) {
				continue;
			} 
			if(isprime(i)) {
				x=i;
				if((x+6)<=n) {
					if(isprime(x+6)) {
						pair++;
					}
				}else {
					break;
				}
			}
		}
		System.out.println(""+pair);
		long end = System.currentTimeMillis();
	      //finding the time difference and converting it into seconds
	      float sec = (end - start) / 1000F; System.out.println(sec + " seconds");
	}
	
}
