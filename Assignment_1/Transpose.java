package Assignment_1;
import java.util.Arrays;
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] newarr=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				newarr[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(Arrays.toString(newarr[i]));
		}

	}

}
