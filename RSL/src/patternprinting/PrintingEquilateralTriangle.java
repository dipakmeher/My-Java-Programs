package patternprinting;

import java.io.*; 

//Java code to demonstrate star patterns 
 class PrintingEquilateralTriangle 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i,j;
		for(i=0;i<n;i++){
			
			for(j=n-i;j>1;j--) {
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
