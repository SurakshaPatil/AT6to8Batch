package Constructors;

public class DefaultConstructor {

	    String name;
	    int age;

	    // Default Constructor
	    DefaultConstructor() {
	        System.out.println("Default Constructor Called!");
	        name = "Unknown";
	        age = 0;
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	  public static void main(String[] args) {
		  DefaultConstructor c1 = new DefaultConstructor(); // Default constructor is called
	    }
	}
