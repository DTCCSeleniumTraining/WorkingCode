package week1.day4;

public class LearnConstructor {
	String functionName;
	int a,b;
	public LearnConstructor() {
		System.out.println("I'm in default");
	}
	
	public LearnConstructor(int a1,int b1,String functionName1) {		
		a= a1;
		b = b1;
		functionName= functionName1;
		System.out.println("I'm in Constructor");		
	}

	public void displayFn() {
		System.out.println(functionName+" function is executed");
	}

	public void sum() {
		int c = a+b;
		System.out.println("The Sum is: "+c);
	}

	public void diff() {
		int c = a-b;
		System.out.println("The Difference is: "+c);
	}

	public void multiply() {
		int c = a*b;
		System.out.println("The Multiplied value is: "+c);
	}

	public void divide() {
		int c = a/b;
		System.out.println("The Remainder is: "+c);
	}

}
