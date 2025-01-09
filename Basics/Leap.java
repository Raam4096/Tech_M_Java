package Basics;
import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }

            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    
}
