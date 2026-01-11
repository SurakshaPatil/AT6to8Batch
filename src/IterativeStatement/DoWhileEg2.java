package IterativeStatement;

public class DoWhileEg2 {

	public static void main(String[] args) {
		int i=101;
		int sum=0;
		do {
			if(i%2!=0) {
			sum = sum +i;
			System.out.println("odd numbers are "+sum);
			}
			i++;
		} while(i<=100);
	}

}
