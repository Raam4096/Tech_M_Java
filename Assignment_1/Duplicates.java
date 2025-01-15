//Remove Duplicate elements from an array
package Assignment_1;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,4,6,4,3,7,9};
		System.out.println("Array after removal of Duplicates:");
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	count=0;
        	for(int x:arr) {
        		if(x==arr[i]) {
        			count++;
        		}
        	}
        	if(count==1) {
        		System.out.print(arr[i]+" ");
        	}
        }
	}

}
