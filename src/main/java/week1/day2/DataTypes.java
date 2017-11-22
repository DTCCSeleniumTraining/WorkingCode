package week1.day2;

public class DataTypes {
	public void math(int d,int e) {
		int a = 2;
		int b = 3;
		int c = a+b+d;
		System.out.println("C :"+c);
		//if(condition){...}
		
	}
	public void ifExample(int a,int b) {
		if(a>b) {
			System.out.println("A>B");
		}else if(a==b) {
			System.out.println("A=B");
		}else
			System.out.println("A<B");
	}
	
	public void forExample() {
		//for(initialization;condition;iteration){...}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//System.out.println("I : "+i);
			sum = sum+i;
		}
		System.out.println("Sum : "+sum);
	}
	public void whileExample() {
		//while(condition){....}
		int a = 100,sum = 0;
		while(a<=10) {
			sum = sum+a;
			a++;
			System.out.println("while");
		}
		System.out.println("Sum : "+sum);
	}
	 
	public void doWhileExample() {/*
		//do{...}while(condition)
		int a=100,sum=0;
		do {
			sum = sum+a;
			a++;
			System.out.println("do while");
		}while(a<=10);
		System.out.println("Sum : "+sum);
	*/
		int e = 11;
		do {
			int a[] = new int[5];
			a[3]= 1;
			e=e+1;
			System.out.println("from do while: "+e);
		} while (e<10);
		}
	
	public void switchExample(int a) {
		switch(a) {
		case 0: System.out.println("Monday");break;
		case 1: System.out.println("Tuesday"); break;
		default : System.out.println("Not valid"); break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		dt.math(3,5);
		dt.ifExample(13,4);
		dt.forExample();
		dt.whileExample();
		dt.doWhileExample();
		dt.switchExample(3);
		AccessModifier am = new AccessModifier();
		System.out.println(am.a);
	}
	
	
	
	
	
	
	
	
	
	
	
}