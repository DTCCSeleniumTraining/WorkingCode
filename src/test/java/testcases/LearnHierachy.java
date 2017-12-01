package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LearnHierachy {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }
  
  @Test(dataProvider = "dp")
  public void f2(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am After Method");
  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("I am in Data Provider");
    return new Object[][] {	
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am After Class");
  }

}
