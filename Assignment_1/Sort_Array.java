//Java program to sort an array in descending order
package Assignment_1;
import java.util.Arrays;

public class Sort_Array {
public static void main(String args[]) {
	int arr[]= {2,1,4,8,3,2,6,5};
	Arrays.sort(arr);
	System.out.println("Sorted Array:");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
