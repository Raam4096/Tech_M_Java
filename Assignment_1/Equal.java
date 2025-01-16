//checking arrays are equal or not
package Assignment_1;
import java.util.Arrays;
import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array 1 Size :");
        int n1=s.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter array1 elements:");
        for(int i=0;i<n1;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter array 2 Size :");
        int n2=s.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter array2 elements:");
        for(int i=0;i<n2;i++){
            arr2[i]=s.nextInt();
        }
        if(n1==n2){
       
        boolean b=Arrays.equals(arr1, arr2);
        if(b){
            System.out.println("Arrays are eqaul");
        }
        else{
            System.out.println("arrays are not equal");
        }}
        else{
            System.out.println("not equal");
        }
    }
}
