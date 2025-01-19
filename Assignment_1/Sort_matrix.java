package Assignment_1;
import java.util.Arrays;
public class Sort_matrix {
public static void main(String args[]) {
int arr[][]= {{5,2,3},{3,1,2},{1,5,1}};
int k=0;
for(int i=0;i<3;i++) {
	k=0;
	while(k<2) {
	for(int j=1;j<3;j++) {
		if(arr[j-1][i]>arr[j][i]) {
			int temp=arr[j-1][i];
			arr[j-1][i]=arr[j][i];
			arr[j][i]=temp;
		}
		
	}
	k++;
	}
}
	for(int i=0;i<3;i++) {
		System.out.print(Arrays.toString(arr[i]));
		System.out.println();
	}
	
}
}
