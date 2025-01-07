package Basics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=152;
        int rev=0;
        int f=a;
        while(a!=0) {
        	int temp=a%10;
        	rev=rev*10+temp;
        	a=a/10;
        }
        if(f==rev) {
        	System.out.println("its a palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
	}

}
