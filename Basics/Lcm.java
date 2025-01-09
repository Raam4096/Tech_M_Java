package Basics;
import java.util.Scanner;

public class Lcm {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number a :");
    int a = s.nextInt();
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
    int j=1;
    while(big!=0){
        int temp=j*big;
        if(temp%low==0){
            LCM=temp;
            break;
        }
        j++;
    }
    System.out.println("LCM of "+a+" and "+b+" is "+LCM);

  }
}