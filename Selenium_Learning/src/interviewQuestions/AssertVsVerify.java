package interviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	
	  @Test 
	  public void testing_Assert() { // Hard Assertion
	  System.out.println("Before Assertion"); 
	  Assert.fail();
	  Assert.assertEquals(true, false); 
	  System.out.println("After Assertion");
	  }
	 
	/*
	 * @Test public void testing_Verify() { //Soft assertion SoftAssert assert1 = new
	 * SoftAssert(); System.out.println("Before Assertion"); assert1.fail();
	 * System.out.println("After Assertion"); }
	 */

	}


