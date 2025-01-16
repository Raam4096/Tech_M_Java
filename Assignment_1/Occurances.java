//Remove all the occurances of a element
package Assignment_1;

import java.util.Scanner;

public class Occurances {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("enter Element to be removed:");
        int x = s.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr1[i]) {
                count++;
            }
        }

        int arr[] = new int[n - count];
        int j = 0;
        for (int y : arr1) {
            if (x != y) {
                arr[j] = y;
                j++;
            }
        }
        System.out.println("After removal:");
        for (int z = 0; z < j; z++) {
            System.out.println(arr[z]);
        }
    }

}
