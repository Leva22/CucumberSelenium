package basic_tests;

import org.testng.annotations.Test;

public class Basic_2 {

	@Test(groups = { "smoke" })
	public void testBasicExplore1() {
		System.out.println("Testing no Regresion for testBasicExplore 1...." + this.getClass().getName());
	}

	@Test(groups = { "smoke" })
	public void testBasicExplore2() {
		System.out.println("Testing no Regresion for testBasicExplore 2...." + this.getClass().getName());
	}

	@Test
	public void testMobileLogginHome() {
		System.out.println("Testing Mobile Login Home" + this.getClass().getName());
	}

	@Test
	public void testWebLogginHome() {
		System.out.println("Testing Web Login Home" + this.getClass().getName());
	}
}
