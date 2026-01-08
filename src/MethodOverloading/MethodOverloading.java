package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MathOperation obj = new MathOperation();
        obj.add(5, 10);      // Calls add(int, int)
        obj.add(5, 10, 15);  // Calls add(int, int, int)
        
        MathOperation2 obj2 =new MathOperation2();
        obj2.add(2.5, 5.5);
        obj2.add(5, 10);
        
        MathOperation3 obj3 = new MathOperation3();
        obj3.add(4, "Test");
        obj3.add("Test1223", 7);
	}

}
