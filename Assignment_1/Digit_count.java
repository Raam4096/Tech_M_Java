package Assignment_1;

public class Digit_count {
public static void main(String arg[]) {
	int a=1345;
	int len=0;
	int sum=0;
	int max=a%10;
	int min=a%10;
	while(a>0) {
		int temp=a%10;
		if(min>temp)
			min=temp;
		if(max<temp)
			max=temp;
		sum+=temp;
		a=a/10;
		len++;
	}
	System.out.println("count is "+len);
	System.out.println("Sum of digits is "+sum);
	System.out.println("min is "+min);
	System.out.println("max is "+max);
}
}
