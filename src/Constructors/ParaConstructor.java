package Constructors;

public class ParaConstructor {
	
	String name;
    int age;
 // Parameterized Constructor
    ParaConstructor(String n, int a) {
        System.out.println("Parameterized Constructor Called!");
        name = n;
        age = a;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
 public static void main(String[] args) {
	 ParaConstructor s1 = new ParaConstructor("Rahul", 20); // Passing values to constructor
	 ParaConstructor s2 = new ParaConstructor("Anjali", 22); // Another object with different values
    }
}
