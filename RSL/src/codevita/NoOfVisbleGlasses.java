package codevita;
import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays; 
public class NoOfVisbleGlasses {
	    private static Scanner sc;

		static int minimumBox(int []arr, int n) 
	    { 
	          
	        // New Queue of integers. 
	        Queue<Integer> q = new LinkedList<>(); 
	      
	        // sorting the array 
	        Arrays.sort(arr); 
	      
	        q.add(arr[0]); 
	          
	        // traversing the array 
	        for (int i = 1; i < n; i++) 
	        { 
	            int now = q.element(); 
	      
	            // checking if current element 
	            // is greater than or equal to 
	            // twice of front element 
	            if (arr[i] > now) 
	            q.remove(); 
	      
	            // Pushing each element of array 
	            q.add(arr[i]); 
	        } 
	      
	        return q.size(); 
	    }  
	      
	    // Driver code 
	    public static void main(String args[])  
	    { 
	    	int i;
	    	sc = new Scanner(System.in);
	    	int N = sc.nextInt();
	    	int []arr = new int[N];
	    	for(i=0;i<N;i++) {
	    		arr[i] = sc.nextInt();
	    	} 
	          
	        System.out.println(minimumBox(arr, N)); 
	    } 
	} 