package week1.day4;

public class LearnMethodsReturnType {
	
	int a = 10;
	String functionName;
	boolean isExecuted;
	
	
	public String displayFn() {
		functionName = "LearnMethodsReturnType";
		return functionName+" class is executed";
	}
	
	public int sum() {
		a = a+50;
		return a;
	}
	
	public boolean isExecutedMethod() {
		return isExecuted = true;		
	}
	
	public static void main(String[] args) {
		LearnMethodsReturnType l2 = new LearnMethodsReturnType();
		String s1 = l2.displayFn();
		System.out.println(s1);
		int s2 = l2.sum();
		System.out.println(s2);
		boolean s3 = l2.isExecutedMethod();
		System.out.println(s3);
	}

}
