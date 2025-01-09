public class Reverse {
    public static void main(String args[]){
        int[] arr={1,4,2,3};
        int[] arr1=new int[4];
        int j=arr.length-1;
    for(int i=0;i<arr.length;i++){
       arr1[i]=arr[j];
       j--;
    }
    for(int x:arr1){
        System.out.println(x);
    }
}
}
