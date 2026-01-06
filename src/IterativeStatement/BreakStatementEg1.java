package IterativeStatement;

public class BreakStatementEg1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if (i==3) {
				System.out.println("Break point is "+ i);
				break;
			}
			System.out.println("i ="+i);
		}
	}

}
