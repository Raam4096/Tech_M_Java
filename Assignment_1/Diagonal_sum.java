package Assignment_1;

public class Diagonal_sum {
public static void main(String arg[]) {
	int[][] arr= {{1,2,3},{2,3,1},{5,4,3}};
	int sum=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(i==j) {
			sum+=arr[i][j];	
			}
		}
		
	}
	System.out.println("Sum of Diagonal elements "+sum);
	}
}
