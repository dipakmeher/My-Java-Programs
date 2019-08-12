package patternprinting;

import java.io.*; 

//Java code to demonstrate star patterns 
class Printingnumbers 
{ 
	// Function to demonstrate printing pattern 
	public static void printStars(int n) 
	{ 
		int i, j,num; 

		// outer loop to handle number of rows 
		// n in this case 
		for(i=0; i<n; i++) 
		{ 
			num=1;
			// inner loop to handle number of columns 
			// values changing acc. to outer loop	 
			for(j=0; j<=i; j++) 
			{ 
				// printing stars 
				System.out.print(num+" "); 
				num++;
			} 

			// ending line after each row 
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
