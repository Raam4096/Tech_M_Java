//Java Program to Find the Largest Element in an Array

package Assignment_1;

import java.util.Scanner;
public class Max_Element {
public static void main(String args[]) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the array size");
	int n= s.nextInt();
	int max=0;
	int[] arr=new int[n];
	System.out.println("Enter array elements");
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	max=arr[0];
	for(int y:arr) {
		if(max<y) {
			max=y;
		}
	}
	System.out.println("Max element in the array is "+max);
	}
}
