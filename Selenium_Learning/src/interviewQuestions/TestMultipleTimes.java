package interviewQuestions;

import org.testng.annotations.Test;

public class TestMultipleTimes {

	@Test(invocationCount = 3)	//test will run 3 times, for invocationCount
	public void test() {
		System.out.println("Kavi");
	}
	
}
