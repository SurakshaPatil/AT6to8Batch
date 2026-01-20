package AbstractInterface;

public class Flipcart implements ECommerce {

@Override
public void placeOrder(String item, int quantity) {

	System.out.println("Order placed on Flipcart: "+item+" "+quantity);
}
}