package MethodOvveriding;

public class MethodOverriding {

	public static void main(String[] args) {
		Bank b;  // Parent class reference
        
        b = new SBI();  
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());  
        
        b = new ICICI();  
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());  
        
        b = new RBI();  
        System.out.println("RBI Rate of Interest: " + b.getRateOfInterest());
	}

}
