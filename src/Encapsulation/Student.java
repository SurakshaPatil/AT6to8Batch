package Encapsulation;

public class Student {

	private String name;
	private int age;
	
	public void setName(String n) {
		name=n;
	}
	
	String getName(){
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	int getAge() {
		return age;
	}
}
