package testngFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	@BeforeSuite
	public void installsoftware() {
		System.out.println("testngFiles2 Annot2 installsoftware @BeforeSuite");
	}

	@Test
	public void software() {
		System.out.println("testngFiles2 Annot2 software");
	}

	@AfterSuite
	public void deinstallsoftware() {
		System.out.println("testngFiles2 Annot2 deinstallsoftware @AfterSuite");
	}

}
