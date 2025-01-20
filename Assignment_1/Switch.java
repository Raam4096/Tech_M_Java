package Assignment_1;

public class Switch {
	    public static void main(String[] args) {
	        int day = 3; // Change this to test with different days

	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	            case 7:
	                System.out.println("Weekend!");
	                break;
	            default:
	                System.out.println("Invalid day");
	        }
	    }
	}


