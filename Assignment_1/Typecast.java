package Assignment_1;

public class Typecast {
	    public static void main(String[] args) {
	        // Implicit casting (widening)
	        int num = 10;
	        double numDouble = num;
	        System.out.println("Implicit casting (int to double): " + numDouble);

	        // Explicit casting (narrowing)
	        double salary = 7586.87;
	        int roundedSalary = (int) salary;
	        System.out.println("Explicit casting (double to int): " + roundedSalary);

	        // Character to ASCII
	        char letter = 'A';
	        int ascii = (int) letter;
	        System.out.println("Explicit casting (char to int): " + ascii);
	    }
	}


