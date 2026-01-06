package Variables;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("a before swapping : "+ a );
		System.out.println("b before swapping : " + b );
		
		a=a+b;      //a=10+20=30
		b=a-b;     //b=30-20=10
		a=a-b;    //a=30-10=20
		
		System.out.println("a after swapping: "+a);
		System.out.println("b after swapping: "+b);
	}

}
