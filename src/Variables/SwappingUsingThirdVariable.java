package Variables;

public class SwappingUsingThirdVariable {

	public static void main(String[] args) {

		int a= 10;
		int b =20;
		
		System.out.println("a before swapping : "+ a );
		System.out.println("b before swapping : " + b );
		
		int c=a; //c=10
		a=b;     //a=20
		b=c;     //b=10
		
		System.out.println("a after swapping: "+a);
		System.out.println(" b after swapping: "+b);
	}

}
