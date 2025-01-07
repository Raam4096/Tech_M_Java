package Arrays;

public class Sum_pairs {

	public static void main(String[] args) {
		int[] arr= {1,2,4,3,7,9,2,3,2};
		int[] new_arr=new int[arr.length];
		int count;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count==1) {
				new_arr[i]=arr[i];
			}
		}
		for(int x:new_arr) {
			System.out.print(x+" ");
		}
		int key_sum=5;
		int res=0;
		for(int i=0;i<new_arr.length;i++) {
			res=0;
			for(int j=i;j<new_arr.length;j++) {
				if(i==j) {
					continue;
				}
				else {
				   res=new_arr[i]+new_arr[j];
						   if(res==key_sum) {
							 System.out.println(new_arr[i]+","+new_arr[j]);  
						   }
				}
			}
		}

	}

}
