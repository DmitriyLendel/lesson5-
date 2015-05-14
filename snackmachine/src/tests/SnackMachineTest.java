package tests;

//import junit.framework.Assert;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import snackmachine.Coffee;
import snackmachine.SnackMachine;
import snackmachine.Toast;

public class SnackMachineTest {

	@BeforeClass
	public static void init() {
		System.out.println("Test Started");

	}

	@AfterClass
	public static void exit() {
		System.out.println("Test Finished");

	}

	@Test
	public void test_coffe() throws Exception {
		System.out.println("Test coffe started");
		
        Coffee coffee = new Coffee();

		Assert.assertEquals(1, coffee.make());
		Assert.assertEquals(10, coffee.make(10));
		Assert.assertEquals(0, coffee.make(-10));

		System.out.println("Test coffe finished");
	}

	@Test(dependsOnMethods = "test_coffe")
	public void test_toast() {

		Toast toast = new Toast();

		Assert.assertEquals(1, toast.make());
		Assert.assertEquals(10, toast.make(10));
		Assert.assertEquals(0, toast.make(-10));
		
	}

	@Test
	public void parameters_test() {
		Assert.assertEquals("Version 1.1", SnackMachine.getVersion());
		Assert.assertTrue(SnackMachine.getHelp().contains("-makeToast"));

	}
	@Test
	public void parameters_toast(){
		Toast toast = new Toast();
		Assert.assertEquals(0.0, toast.getCalories(-10));
		Assert.assertEquals(332343.0,toast.getCalories(100) );
	}
	@Test
	public void parametrs_coffe(){
		Coffee coffee = new Coffee();
		Assert.assertEquals(1000.0, coffee.getCalories(10, -10));
		int t = 5;
		double weight = 35.5;
		double a= (Coffee.kl * (t / (t + 10))) * weight;
		Assert.assertEquals(a, coffee.getCalories(weight, t));
		Assert.assertEquals(0.0, coffee.getCalories(-10, 10));
		
		
		
	}
}

