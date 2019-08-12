package secondlargest;
import java.util.*;
import java.io.*;
public class SecondLargest {

	public static void main(String[] args) {
 
		int arr[] = { 4,4,4,2 };
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest && arr[i]!=largest) {
				secondLargest = arr[i];
 
			}
		}
		if(secondLargest ==  Integer.MIN_VALUE) {
			System.out.println("There is no second largest value.");
		}else {
			System.out.println("Second Largest element is: "+ secondLargest);
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}
