package StatisNonStatic;

public class CounterCopy {

	public static void main(String[] args) {

		Counter.incrementStatic();
		Counter.incrementStatic();
		
		Counter c1 = new Counter();
		c1.incrementNonstatic();
		c1.incrementNonstatic();
	}

}
