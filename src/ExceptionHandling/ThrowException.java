package ExceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
        int age = 25;
        if (age < 18) {
            throw new IllegalArgumentException("Access denied - You must be 18+");
        }
        System.out.println("Welcome!");
	}

}
