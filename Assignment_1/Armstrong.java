package Assignment_1;
import java.util.Scanner;
public class Armstrong {

public static void main(String[] args) {
	int a=153;
	int n=a;
	double res=0;
	int len=0;
	int n1=a;
	while(n>0) {
		int t=n%10;
		len++;
		n=n/10;
	}
	while(a>0) {
		int t=a%10;
		res=res+Math.pow(t, len);
		a=a/10;
	}
	
	if(res==n1) {
		System.out.println("its an armstrong");
	}
	else {
		System.out.println("not armstrong");
	}

	}

}
