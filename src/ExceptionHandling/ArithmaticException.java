package ExceptionHandling;

public class ArithmaticException {

	public static void main(String[] args) {
		try {
			int a=50/0;
			System.out.println("Result: "+a);
		}catch(ArithmeticException e) {
			System.out.println("Invalid operation");
		}
	}

}
