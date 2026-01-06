package IterativeStatement;

public class ContinueEg1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // Skip iteration when i is 3
            }
            System.out.println("i = " + i);
        }
	}

}
