public class Right_rotation {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int temp=arr[arr.length-1];
        int i;
        for(i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
        for(int x:arr){
            System.out.print(x+ " ");
        }
    }
}
