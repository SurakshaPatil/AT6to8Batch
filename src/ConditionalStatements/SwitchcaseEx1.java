package ConditionalStatements;

public class SwitchcaseEx1 {

	public static void main(String[] args) {

        int day = 9;
        
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
        	System.out.println("Saturday");
        	break;
        case 7:
        	System.out.println("Sunday"); 
        	break;
        default:
        	System.out.println("Invalid day");
        	}
	
 //Check vowel or consonant  
 //Take a letter as input and use `switch` to print `"Vowel"` or `"Consonant"`.  

	 char ch = 'c';   // fixed letter

     switch (ch) {
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
             System.out.println("Vowel");
             break;
         default:
             System.out.println("Consonant");
     }
     
 //Simple Calculator:Take two numbers and an operator (`+, -, *, /`) as input. Use `switch` to perform the corresponding operation
     int a = 10;        // first number
     int b = 5;         // second number
     char op = '-';     // operator

     switch (op) {
         case '+':
             System.out.println(a + b);
             break;
         case '-':
             System.out.println(a - b);
             break;
         case '*':
             System.out.println(a * b);
             break;
         case '/':
             System.out.println(a / b);
             break;
         default:
             System.out.println("Invalid Operator");
     }
 
 //Print month name:Take a number (`1-12`) as input and print the month name using `switch`.
     int month = 10;   // fixed month number

     switch (month) {
         case 1: System.out.println("January"); break;
         case 2: System.out.println("February"); break;
         case 3: System.out.println("March"); break;
         case 4: System.out.println("April"); break;
         case 5: System.out.println("May"); break;
         case 6: System.out.println("June"); break;
         case 7: System.out.println("July"); break;
         case 8: System.out.println("August"); break;
         case 9: System.out.println("September"); break;
         case 10: System.out.println("October"); break;
         case 11: System.out.println("November"); break;
         case 12: System.out.println("December"); break;
         default: System.out.println("Invalid Month");
     }

	}
	
}
