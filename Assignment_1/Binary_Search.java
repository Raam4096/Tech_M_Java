package Assignment_1;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {4, 2, 1, 5, 7, 3}; 
        Arrays.sort(arr); 
        
        int min = 0; 
        int max = arr.length - 1; 
        int x = 7;
        boolean found=false;
        while (min <= max) {
            int mid = (min + max) / 2; 
            
            if (arr[mid] == x) {
                System.out.println("Element found at index " + mid);
                found=true;
            } 
            
            if (arr[mid] < x) {
                min = mid + 1; 
            } else {
                max = mid - 1;
            }
        }
        
       if(!found)
        System.out.println("Element not found");
    }
}
