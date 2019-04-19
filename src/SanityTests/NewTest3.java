package SanityTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	@BeforeGroups (groups = {"regression"})
	  public void login() {
		  System.out.println("login successfull");
	  }
	@Test (groups = {"sanity"})
	  public void addP1() {
		  System.out.println("P1 successfull");
	  }
	  @Test (groups = {"regression"},priority = 2)
	  public void addP2() {
		  System.out.println("P2 successfull");
	  }
	  @Test (groups = {"sanity","regression"}, priority = 3)
	  public void delP1() {
		  System.out.println("D1 successfull");
	  }
	  @Test(groups = {"regression"},priority = 1)
	  public void delP2() {
		  System.out.println("D2 successfull");
	  }
	  @AfterGroups (groups = {"regression"})
	  public void logout() {
		  System.out.println("logout successfull");
	  }
}
