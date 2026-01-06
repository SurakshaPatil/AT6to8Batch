package ConditionalStatements;

public class IfEx1 {
	public static void main(String args []) {
	
		 int num = -10;   
	        if (num > 0) {
	            System.out.println("Positive Number");
	        }
	
		int age = 20;
		if (age > 18) {
			System.out.println("Eligible to vote");
		}
		
		int number = 16;
		if (number % 2 ==0 ) {
			System.out.println(number + " is Even number");
		}
	
		char value= 'a';
		if (value >= 'A' && value <= 'Z') {
			System.out.println(value + " is a Uppercase Letter");
		}
		
	}
}
