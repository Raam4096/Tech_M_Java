//Java Program to Copy All the Elements of One Array to Another Array

package Assignment_1;

import java.util.Arrays;

public class Copy_array {
public static void main(String[] args) {
    int arr[]={2,6,1,2,6,7};
    int arr1[]=new int[arr.length];
   arr1= Arrays.copyOf(arr, 6);
   System.out.println(Arrays.toString(arr1));
}    
}
