package ConditionalStatements;

public class NestedifEx1 {

	public static void main(String[] args) {
       //Check if a number is positive and even  
		int number = 53;
        if (number > 0) { // Outer if
        System.out.println("The number is positive");
        if (number % 2==0) { // Inner if
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    } else {
        System.out.println("The number is negative");
    } 

//Check Admission Eligibility  : A student is eligible for admission if:  - Marks ≥ 80, and   - Math score ≥ 75  If both conditions are met, print `"Eligible"`, otherwise print `"Not Eligible
 
        int marks = 75;      // total marks
        int mathScore = 68;  // math score

        if (marks >= 80) {
        	System.out.println("You are eligible for admission");// first condition
            if (mathScore >= 75) {         // second condition
                System.out.println("Eligible because mathscore");
            } else {
                System.out.println("Not Eligible because mathscore");
            }
        } else {
            System.out.println("Not Eligible because marks");
        }       
        
 //Check if a person can enter a club A person can enter if:
//Age ≥ 18, and Has a membership card Print "Entry Allowed" or "Entry Denied".

        int age = 19;                 // fixed age
        boolean hasCard = true;       // membership card

        if (age >= 18) {              // first condition: age check
           System.out.println("Your age is " + age); 
        	if (hasCard) {            // second condition: membership card
                System.out.println("Entry Allowed");
            } else {
                System.out.println("Entry Denied");
            }
        } else {
            System.out.println("Entry Denied because age");
        }
        
//Check login credentials  If the username is `"admin"`, then check if the password is `"1234"`.  
//- If both match, print `"Login Successful"`  -Otherwise, print `"Invalid Credentials
        
        String username = "admin";   // fixed username
        String password = "1234";    // fixed password

        if (username.equals("admin")) {  
        	System.out.println("Username is matching");// check username
            if (password.equals("1234")) {     // check password
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Credentials");
            }
        } else {
            System.out.println("Invalid Username");
        }
	}
}
