// Java Program to Search an Element in an Array

package Assignment_1;
import java.util.Scanner;
public class Search_Elem {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	int[] arr= {2,4,1,5};
	for(int x:arr) System.out.print(x+" ");
	System.out.println();
	System.out.println("Enter element to search from the array");
	int z=s.nextInt();
	int flag=0;
	for(int i=0;i<arr.length;i++) {
		
		if(arr[i]==z) {
			System.out.println("Element found at "+i+" index");
			flag=1;
			break;
		}
			
		}
	if(flag==0) {
		System.out.println("element not found");
	}
s.close();	
}
}
