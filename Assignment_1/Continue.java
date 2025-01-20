package Assignment_1;

public class Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // Skip the even numbers
			}
			System.out.println("Odd number: " + i);
		}
	}
}
