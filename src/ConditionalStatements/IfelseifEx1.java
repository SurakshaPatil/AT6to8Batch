package ConditionalStatements;

public class IfelseifEx1 {

	public static void main(String[] args) {
		/*: Take a student's marks as input and print their grade:  
`90-100` → `"A+"`   - `80-89` → `"A"`   - `70-79` → `"B"`   - `60-69` → `"C"`   - `< 60` → `"Fail"`*/
		int marks=85;
		if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        }else if(marks >= 60) {
        	 System.out.println("Grade: D");   	
            } else {
            System.out.println("Grade: F");
        }
		
		
/*Check temperature levels  :Take a temperature value as input and classify it as:  
- `> 30°C` → `"Hot"`  - `20-30°C` → `"Warm"`  - `10-19°C` → `"Cold"`  - `< 10°C` → `"Very Cold"`  */				
			int temp=30;
			if (temp >= 30) {
	            System.out.println("Hot");
	        } else if (temp >= 20) {
	            System.out.println("Warm");
	        } else if (temp >= 10) {
	            System.out.println("Cold");
	         } else {
	            System.out.println("Very cold");
	        }

	}

}
