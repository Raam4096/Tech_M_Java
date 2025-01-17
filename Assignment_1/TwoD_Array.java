package Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter no of rows :");
        int row=s.nextInt();
        System.out.println("enter no of columns :");
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("enter array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
         System.out.println("the 2 array is");

         for(int i=0;i<row;i++){
            System.out.print(Arrays.toString(arr[i]));
         }

    }
}
