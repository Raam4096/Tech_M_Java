
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int arr[]={2,1,3,2,2,3};
        Arrays.sort(arr);
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                }
            }
            if(count>=1)
            {
                System.out.println(arr[i]);
                i+=count;
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }}
//    
//=======
//package Arrays;
//import java.util.Scanner;
//public class Duplicates {
//public static void main(String arg[]) {
//	Scanner s= new Scanner(System.in);
//	int arr[]= {2,2,5,6,7,5};
//	int arr1[]=new int[arr.length-1];
//	int dup[]=new int[arr.length-1];
//	int count=0;
//	int k=0;
//	
//	for(int x:arr) {
//		count=0;
//	for(int i=0;i<=arr.length-1;i++) {
//	    if(x==arr[i]) {	
//	    	count++;
//	    }
//	    	}
//	if(count==1) {
//	arr1[k]=x;
//	k++;
//	}
//	else {
//		int top=0;
//		for(int y:arr1) {
//			if(x==y) {
//				top++;
//			}
//		}
//		if(top==0) {
//			arr1[k]=x;
//			
//		}
//	}
//}
//for(int j=0;j<arr1.length;j++) {	
//	System.out.print(arr1[j]+" ");
//}
//}
//}
