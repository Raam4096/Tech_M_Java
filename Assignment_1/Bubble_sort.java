package Assignment_1;
import java.util.Arrays;
public class Bubble_sort {
public static void main(String args[]) {
	int[] arr1= {5,1,3,6,7,2};
	for(int i=0;i<arr1.length-1;i++) {
		for(int j=0;j<arr1.length-i;j++) {
			if(j<arr1.length-1) {
			if(arr1[j]>arr1[j+1]) {
				int tmp=arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=tmp;
			}
		}}
		
	}System.out.println(Arrays.toString(arr1));
}
}
