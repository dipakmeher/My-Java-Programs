package patternprinting;

import java.io.*; 

//Java code to demonstrate star patterns 
 class Printing180RightAngleTriangle 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i,j;
		for(i=0;i<n;i++){
			for(j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	} 

	// Driver Function 
	public static void main(String args[]) 
	{ 
		int n = 5; 
		printStars(n); 
	} 
} 
