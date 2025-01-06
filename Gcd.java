import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number a :");
        int a=s.nextInt();
        System.out.println("enter number b :");
        int b=s.nextInt();
        int low=0;
    int big=0;
    int LCM=0;
    if(a>b)
    {
    big=a;
    low=b;
    }
    else{
        big=b;
        low=a;
    }

    while(big!=0){
        int res=big%low;
        if(res!=0){
            big=low;
            low=res;
        }
        else{
            System.out.println("GCD is "+low);
            break;
        }
    }


        
    } 
}
