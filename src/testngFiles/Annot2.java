package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	@BeforeSuite
	public void installsoftware() {
		System.out.println("testngFiles / installsoftware @BeforeSuite in Annot2");
	}

	@Test
	public void software() {
		System.out.println("testngFiles / Annot2");
	}

	@AfterSuite
	public void deinstallsoftware() {
		System.out.println("testngFiles / deinstallsoftware @AfterSuite in Annot2");
	}

}
