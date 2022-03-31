package interviewQuestions;

import org.testng.annotations.Test;

public class DependsOnFails {

	
	  @Test public void parentsPermission() {
	  System.out.println("Parents Permission Given"); }
	  
	  @Test (dependsOnMethods = "parentsPermission") public void loveMarriage() {
	  System.out.println("Marriage Happened"); }
	 
	
	/*
	 * @Test(timeOut = 2000) public void parentsPermission() throws
	 * InterruptedException { Thread.sleep(3000);
	 * System.out.println("Parents Permission Given"); }
	 * 
	 * @Test (dependsOnMethods = "parentsPermission", alwaysRun = true) public void
	 * loveMarriage() { System.out.println("Marriage Happened"); }
	 */
}
