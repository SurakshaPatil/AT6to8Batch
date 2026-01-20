package StaticNonStatic;

public class NonStaticEg1 {

	public void showMsg() {
		System.out.println("This is a non static method.");
	}
	public static void main(String[] args) {
		NonStaticEg1 obj1=new NonStaticEg1();
				obj1.showMsg();
	}

}
