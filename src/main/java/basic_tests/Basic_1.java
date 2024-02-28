package basic_tests;

import org.testng.annotations.Test;

public class Basic_1 {
	// Establishing a group with an specific tag name identify those test to be
	// executed separatetly if necesary
	@Test(groups = { "smoke" })
	public void testBasicMobileLoggin() {
		System.out.println("Testing no Regresion for Mobile Login..." + this.getClass().getName());

	}

	@Test(groups = { "smoke" })
	public void testBasicWebLogin() {
		System.out.println("Testing no Regresion for WEB Login...." + this.getClass().getName());
	}

	@Test
	public void testMobileLoggin() {
		System.out.println("Testing Mobile Login..." + this.getClass().getName());
	}

	@Test
	public void testWebLoggin() {
		System.out.println("Testing Web Login" + this.getClass().getName());
	}
}
