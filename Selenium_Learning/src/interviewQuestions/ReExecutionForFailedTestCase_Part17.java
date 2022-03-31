package interviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReExecutionForFailedTestCase_Part17 {

	//@Test(retryAnalyzer = RetryListener.class)
	@Test
	public void testCase1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void testCase2() {
		Assert.assertEquals(true, false);
	}
}
