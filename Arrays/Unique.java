


public class Unique {
    public static void main(String[] args) {
        int[] arr={2,7,1,54,3,6,2,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                }

            }
            if(count==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
