package MultipleInheritance;

public class Animal implements Cat,Dog {

	
	public void bark() {
		System.out.println("Its Barking.");
	}


	public void sleep() {
	System.out.println("Its Sleeping.");	
	}
}
