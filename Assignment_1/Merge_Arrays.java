package Assignment_1;

public class Merge_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {2,4,6};
         int arr1[]= {1,3,5};
         int[] new_arr=new int[arr.length+arr1.length];
         int id=0;
         for(int i=0;i<arr.length;i++) {
        	 new_arr[id]=arr[i];
        	 id++;
         }
         for(int i=0;i<arr1.length;i++) {
        	 new_arr[id]=arr1[i];
        	 id++;
         }
         System.out.println("Merged array :");
         for(int x:new_arr) {
        	 System.out.print(x+" ");
         }
	}

}
