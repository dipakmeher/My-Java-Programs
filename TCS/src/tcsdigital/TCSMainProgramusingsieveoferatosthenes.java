package tcsdigital;

import java.util.Scanner;

public class TCSMainProgramusingsieveoferatosthenes {
	public static void main(String[] args) {
		 long start = System.currentTimeMillis();
		 int x,y,pair=0;
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
//		sieveOfEratosthenes(m,n);
		
		
		boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        for(int i = m; i <= n; i++) 
        { 
            if(prime[i] == true) {
	            x=i;
				if((x+6)<=n) {
					if(prime[x+6]==true) {
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
