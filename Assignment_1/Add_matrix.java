//Java Program to Add Two Matrices
package Assignment_1;
import java.util.Scanner;
public class Add_matrix {
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{3,2,1},{1,2,3}};
        int arr2[][]={{3,2,1},{1,2,3},{3,2,1}};
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
