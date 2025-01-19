package Assignment_1;
import java.util.Arrays;
public class Equal_matrix {
public static void main(String args[]) {
	int arr1[][]= {{1,2,3},{2,3,4}};
	int arr2[][]= {{3,2,1},{2,3,4}};
	if(Arrays.deepEquals(arr1, arr2)) {
		System.out.println("both the matrixes are equal");
	}
	else {
		System.out.println("not equal");
	}
}
}
