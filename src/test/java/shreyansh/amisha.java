package shreyansh;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amisha {
@BeforeSuite    // if i want to setup any pre-environment
public void bf() {
	// if you want to connect your class with any excel sheet or with any database thing
	// then you go with before suite
}
@BeforeTest
public void bt() {
	//you can open the browsers in the before test you also can login here
}
@Test(alwaysRun = true, dependsOnMethods = "tc1")
public void tc1() {
	// you can perform further actions in the test method
	//you can create multiple test method in a class
}
@Test
public void tc2() {
	//this is my second test method
}
@AfterSuite
public void as() {
	//to close the database connection that we connected in our before suite
}
@AfterTest
public void at() {
	// closing the browser or you can quit the browser
}
}
