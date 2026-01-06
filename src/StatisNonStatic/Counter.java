package StatisNonStatic;

public class Counter {
	
	static int staticCount=0;
	int nonstaticCount=1;
	
	public static void incrementStatic() {
		staticCount++;
		System.out.println("Static Count : "+staticCount);
	}
	
	public void incrementNonstatic() {
		nonstaticCount++;
		System.out.println("Nonstatic Count: "+nonstaticCount);
	}
	
}
