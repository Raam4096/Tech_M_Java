import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n value :");
        int n=s.nextInt();
        int count=0;
        int prime=0;
        for(int i=2;i<=n;i++){
            count=0;
            for(int j=2;j<i;j++){
                if(i%j==0)
                count++;
            }
            if(count==0)
            prime++;
        }
        System.out.println("No of primes "+prime);
    }
    
}
