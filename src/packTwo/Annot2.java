package packTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	@BeforeSuite
	public void installsoftware() {
		System.out.println("installsoftware @BeforeSuite in Annot2");
	}

	@Test
	public void software() {
		System.out.println("I am the Annot2");
	}

	@AfterSuite
	public void deinstallsoftware() {
		System.out.println("deinstallsoftware @AfterSuite in Annot2");
	}

}
