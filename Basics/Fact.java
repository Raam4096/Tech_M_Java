import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter a number to find its factorial");
        int n=s.nextInt();
        fact(n);
    }
    public static void fact(int n){
        int fact=1;
        while(n!=0){
       fact=fact*n;
       n--;}
       System.out.println("Factorial "+fact);

    }
    
}
