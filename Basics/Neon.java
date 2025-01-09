package Basics;
import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number ");
        int neon=s.nextInt();
        int res=neon*neon;
        int sum=0;
        while(res!=0){
            int temp=res%10;
            sum=sum+temp;
            res=res/10;
        }
        if(neon==sum){
            System.out.println("its a neon number "+sum);
        }
        else{
            System.out.println("not a neon number");
        }
    }
}
