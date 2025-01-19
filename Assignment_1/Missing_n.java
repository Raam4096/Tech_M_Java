package Assignment_1;

public class Missing_n {
public static void main(String arg[]) {
	int arr[]= {1,2,3,5,6,8,10,13};
	int k=0;
	System.out.println("missing elementa are:");
	for(int i=1;i<=arr[arr.length-1];i++) {
		if(arr[k]!=i) {
			System.out.print(i+" ");
			k--;
		}
		k++;
	}
}
}
