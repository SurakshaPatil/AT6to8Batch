package MethodOverriding2;

public class MethodOverrinding2 {

	public static void main(String[] args) {
		Vehical v;
		
		v= new Car();
		v.speed();
		
		v= new Bike();
		v.speed();
	}

}
