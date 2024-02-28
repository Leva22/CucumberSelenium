package basic_tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResult_Listener implements ITestListener {

	public TestResult_Listener() {
		super();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		// Take an screanshot.
		// print API Response.
		System.out.println("Test FAILED Check on it... " + result.getName());

	}

	/**
	 * ItestListener is used to detect wich test fails and do any action on it.
	 */

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		System.out.println("Successfully started " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("Successfully Passed... " + result.getName());
	}

}
