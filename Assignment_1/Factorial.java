package Assignment_1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int i=n;
        int fact=1;
        while(n>0) {
        	fact=fact*n;
        	n--;
        }
        System.out.println("factorial of "+i+" is "+fact);
	}

}
