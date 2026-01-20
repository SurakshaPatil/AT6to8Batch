package ConditionalStatements;

public class IfelseEx1 {
	public static void main(String args []) {
		
/*Check if a number is positive or negative  :Take an integer as input. 
 Print "Positive" if it is greater than `0`, otherwise print "Negative		 */
		 int num = 10;  

	        if (num >= 0) {
	            System.out.println("Positive Number");
	        } else {
	        	System.out.println("Negative Number");
	        }
		
/* Find the largest of two numbers  
Take two numbers as input. Use `if-else` to print the larger number.  */       
		int num1 = 40;
		int num2 = 20;
		if ( num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else {
			System.out.println(num1 + " is less than " + num2);
		}
		
	/*Check if a number is even or odd  
Write a Java program to check if a number is even or odd.  */	
		int number = 17;
		if (number % 2 ==0 ) {
			System.out.println(number + " is Even number");
		} else {
			System.out.println(number + " is odd number");
		}
		
		
/*Check if a person can drive  :A person can drive if their age is **18 or more**. 
 * Print `"Allowed to Drive"` or `"Not Allowed"` accordingly.  */
		int age = 20;
		if (age >= 18) {
			System.out.println("Allowed to drive");
		} else {
			System.out.println("Not Allowed");
		}
	}
	
}
