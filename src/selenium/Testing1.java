package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing1 {
	
	Testing2 t2=new Testing2();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		System.out.println("login");//Putting login here because this class execute before each test case
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
		System.out.println("Logout");//perform logout even though test fail at certain point and execute other test cases
	}

	@Test
	public void test1() {
		System.out.println("Test2");
		t2.test4();
	}
	@Test
	public void test2() {
		//System.out.println("login");
		System.out.println("Test1");
		//System.out.println("Logout");
	}
	@Test
	public void test3() {
		//System.out.println("login");
		System.out.println("Test3");
		//System.out.println("Logout");
	}

}
