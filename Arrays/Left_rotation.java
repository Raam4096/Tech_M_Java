public class Left_rotation {
    public static void main(String[] args) {
        int arr[]={2,3,54,1};
        int temp=arr[0];
        int i;
        for(i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    
}
