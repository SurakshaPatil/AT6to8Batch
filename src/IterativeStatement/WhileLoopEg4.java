package IterativeStatement;

public class WhileLoopEg4 {

	public static void main(String[] args) {
		int i=101;
		int sum= 0;
		while(i<=100) {
			if(i%2!=0) {
				sum=sum+i;
				System.out.println(sum);
			}
			i++;
		}
		
	}

}
