package testcases;

import org.testng.annotations.Test;

public class LearnTestNg2 {
  @Test(priority=0,dependsOnMethods="testcases.LearnTestNg.f2")
  public void f1() {
	  System.out.println("I'm in F1");
  }

}
