package SanityTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1 {
  @BeforeTest
  public void login() {
	  System.out.println("login successfull");
  }
  @Test
  public void addP1() {
	  long id=Thread.currentThread().getId();
	  System.out.println(id);
  }
  @Test
  public void addP2() {
	  System.out.println("P2 successfull");
  }
  @AfterTest
  public void logout() {
	  System.out.println("logout successfull");
  }
}
