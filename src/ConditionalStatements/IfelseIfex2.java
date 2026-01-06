package ConditionalStatements;

public class IfelseIfex2 {

	public static void main(String[] args) {
	
		int num1=10;
		int num2=20;
		int num3= 30;
		if (num1>num2 && num1>num3) {
			System.out.println("Number 1 is largest");
		} else if(num2>num1 && num2>num3) {
			System.out.println("Number 2 is largest");
		} else {
			System.out.println("Number 3 is largest");
		}
	}

}
