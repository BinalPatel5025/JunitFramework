package selenium;

import org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Testing3 {

	@Rule
	public ErrorCollector err = new ErrorCollector();

	@Test
	public void test6() {
		String actual = "abc1";
		String expectd = "abc";

		System.out.println("Before 1st Assert");
		Assert.assertEquals(expectd, actual);
		System.out.println("After 1st Assert");

		Assert.assertTrue("Verify 2>3", 2 > 3);
		System.out.println("After 2nd Assert");
	}

	@Test
	public void test7() {
		String actual = "abc1";
		String expectd = "abc";

		System.out.println("Before 1st Assert");
		try {
			Assert.assertEquals(expectd, actual);
		} catch (Throwable t) {
			System.out.println("I am in Catch 1");
			err.addError(t);
		}
		System.out.println("After 1st Assert");

		try {
			Assert.assertTrue("Verify 2>3", 2 > 3);
		} catch (Throwable t) {
			System.out.println("I am in Catch 2");
			err.addError(t);
		}
		System.out.println("After 2nd Assert");
	}

}
