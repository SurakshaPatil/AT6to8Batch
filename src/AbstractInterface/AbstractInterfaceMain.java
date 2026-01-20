package AbstractInterface;

public class AbstractInterfaceMain {

	public static void main(String[] args) {

		ECommerce e1=new Amazon();
		e1.placeOrder("Mobile", 5);
		
		ECommerce e2=new Flipcart();
		e2.placeOrder("Toy", 10);
	}

}
