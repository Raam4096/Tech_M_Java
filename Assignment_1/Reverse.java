package Assignment_1;

public class Reverse {
public static void main (String arg[]) {
	int n=123;
	int rev=0;
	int n1=n;
	while(n>0) {
		int t=n%10;
		rev=rev*10+t;
		n=n/10;
	}
	System.out.println("reverse is "+rev);
	if(n1==rev) {
		System.out.println("its a palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
