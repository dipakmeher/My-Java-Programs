package tcsdigital;
import java.util.*;
import java.io.*;
import java.time.Duration;
import java.time.Instant;
public class TCSMainprogramAnotherway{
	static boolean isprime(int a) {
		int i,count=0;
		for(i=2;i<(a/2);i++){
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
		Instant start = Instant.now();
		int i,x,y,pair=0;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(i=m;i<n;i++) {
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
		Instant end = Instant.now();
		Duration interval = Duration.between(start, end);
		System.out.println(interval.getSeconds());
	}
	
}
