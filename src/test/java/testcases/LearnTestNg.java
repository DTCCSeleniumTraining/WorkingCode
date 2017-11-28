package testcases;

import org.testng.annotations.Test;

public class LearnTestNg {
  @Test(priority=1,successPercentage=80)
  public void f2() {
	  System.out.println("I'm in F2");
	  //throw new RuntimeException();
  }
 
}
