package IterativeStatement;

public class ForLoopeg3 {

	public static void main(String[] args) {
		int num = 3;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {       //3%1==0  3%2==0  3%3==0
                count++;  //1 2
            }
        }
        if (count == 2)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is Not a Prime number");
	}

}
