package StatisNonStatic;

public class MaxNumber {

	public static void findMax(int a, int b, int c) {
        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Maximum number is: " + max);
    }

	public static void main(String[] args) {
        findMax(40, 25, 15);
	}

}
