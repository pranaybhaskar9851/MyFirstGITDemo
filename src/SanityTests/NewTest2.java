package SanityTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
		  @BeforeClass
		  public void login() {
			  System.out.println("login successfull");
		  }
		  @Test
		  public void delP1() {
			  System.out.println("D1 successfull");
		  }
		  @Test
		  public void delP2() {
			  System.out.println("D2 successfull");
		  }
		  @AfterClass
		  public void logout() {
			  System.out.println("logout successfull");
		  }
		}

