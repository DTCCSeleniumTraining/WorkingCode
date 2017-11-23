package week1.day4;

public class RunClass {

	public static void main(String[] args) {
		LearnConstructor learn = new LearnConstructor(5, 1, "Sethu");
		LearnConstructor learn1 = new LearnConstructor(6, 2, "Sarath");
		LearnConstructor learn2 = new LearnConstructor();
		learn.displayFn();
		learn.sum();
		learn.multiply();
		learn.divide();
		learn1.displayFn();
		learn1.sum();
		learn1.multiply();
		learn1.divide();
	}

}
