package week1.day3;

public class Bicycle {

	int a,b;
	static String text1="Chrome";
	String text2;
	static int i;

	public static void main(String[] args) {
		Bicycle cycle = new Bicycle();
		for ( i= 0; i < 10; i++) {
			System.out.println(i+" i'm in for loop");
			if (i==0) {
				continue;
			}
		}
		i=20;
		do {
			System.out.println(i+" i'm in for loop");
		}while (i<10);
		switch(text1) {
		case "chrome": System.setProperty("", "");
		
		}
	}
}



