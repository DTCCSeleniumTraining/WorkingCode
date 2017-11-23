package week1.day4;

public class LearnArrays {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		int size = a.length;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(size);
		
		String b[] = new String[2];
		//String[] b; 
		b[0] = "sethu";
		b[1] = "Sarath";
		b[2] = "babu";
	}

}
