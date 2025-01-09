
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {
        int arr[]={2,1,3,2,2,3};
        Arrays.sort(arr);
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                }
            }
            if(count>=1)
            {
                System.out.println(arr[i]);
                i+=count;
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
