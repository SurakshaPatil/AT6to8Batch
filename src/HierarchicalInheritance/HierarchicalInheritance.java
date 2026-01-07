package HierarchicalInheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Dog d1 =new Dog();
		d1.name = "Puppy";
		d1.bark();
		d1.eat();
		
		Cat c1=new Cat();
		c1.name="Whity";
		c1.eat();
		c1.walk();
	}

}
